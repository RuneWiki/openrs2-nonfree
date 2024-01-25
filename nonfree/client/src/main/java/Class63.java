import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oaa")
public abstract class Class63 {

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "Z")
	private boolean aBoolean146;

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "Z")
	private boolean aBoolean147;

	@OriginalMember(owner = "client!oaa", name = "l", descriptor = "Z")
	private boolean aBoolean148;

	@OriginalMember(owner = "client!oaa", name = "s", descriptor = "Lclient!io;")
	private Class14_Sub27_Sub1 aClass14_Sub27_Sub1_2;

	@OriginalMember(owner = "client!oaa", name = "x", descriptor = "Lclient!kk;")
	private Class14_Sub27_Sub2 aClass14_Sub27_Sub2_2;

	@OriginalMember(owner = "client!oaa", name = "y", descriptor = "Lclient!waa;")
	private Class14_Sub27_Sub4 aClass14_Sub27_Sub4_2;

	@OriginalMember(owner = "client!oaa", name = "z", descriptor = "Ljava/lang/String;")
	private String aString18;

	@OriginalMember(owner = "client!oaa", name = "B", descriptor = "Z")
	private boolean aBoolean149;

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "[B")
	private final byte[] aByteArray24;

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!oaa", name = "w", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!oaa", name = "f", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!oaa", name = "e", descriptor = "Lclient!jo;")
	private final Class187 aClass187_16;

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(I)V")
	protected Class63(@OriginalArg(0) int arg0) {
		if (!Static160.method2605("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray24 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass187_16 = new Class187(8);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)Z")
	private boolean method1516() {
		if (this.aClass14_Sub27_Sub4_2 == null) {
			@Pc(17) double local17 = (double) this.aClass14_Sub27_Sub1_2.method3736();
			return local17 == 0.0D || (double) Static521.method7499() >= (double) this.aClass14_Sub27_Sub1_2.method3737() + 1000.0D / local17;
		} else {
			return !this.aClass14_Sub27_Sub1_2.method3739() || this.method1532() > this.aClass14_Sub27_Sub1_2.method3734();
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)Z")
	public final boolean method1517() {
		if (this.aBoolean148 || this.aBoolean146) {
			return this.aClass14_Sub27_Sub4_2 == null || this.aClass14_Sub27_Sub4_2.method9056() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)Lclient!ih;")
	private Class14_Sub27 method1518() throws IOException {
		if (this.aBoolean148) {
			throw new IllegalStateException();
		} else if (this.aBoolean146) {
			return null;
		} else {
			@Pc(28) int local28;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local28 = this.method1529(this.aByteArray24);
				if (local28 == -1) {
					this.aBoolean146 = true;
					return null;
				}
				if (local28 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray24, local28)) {
					throw new RuntimeException("");
				}
			}
			local28 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(200) Class14_Sub27 local200 = (Class14_Sub27) this.aClass187_16.method4078((long) local28);
				if (!local200.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local200;
			}
			@Pc(75) OggStreamState local75 = new OggStreamState(local28);
			if (!local75.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local75.packetPeek(this.anOggPacket2) == 1) {
				@Pc(110) Class14_Sub27 local110;
				if (this.aClass14_Sub27_Sub1_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass14_Sub27_Sub1_2 = new Class14_Sub27_Sub1(local75);
					local110 = this.aClass14_Sub27_Sub1_2;
				} else if (this.aClass14_Sub27_Sub4_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass14_Sub27_Sub4_2 = new Class14_Sub27_Sub4(local75);
					local110 = this.aClass14_Sub27_Sub4_2;
				} else {
					@Pc(123) byte[] local123 = this.anOggPacket2.getData();
					@Pc(127) StringBuffer local127 = new StringBuffer();
					for (@Pc(129) int local129 = 1; local129 < local123.length && Character.isLetterOrDigit((char) local123[local129]); local129++) {
						local127.append((char) local123[local129]);
					}
					@Pc(156) String local156 = local127.toString();
					if (local156.equals("kate")) {
						local110 = new Class14_Sub27_Sub2(local75);
					} else {
						local110 = new Class14_Sub27_Sub3(local75);
					}
				}
				this.aClass187_16.method4077((long) local28, local110);
				return local110;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method1519(@OriginalArg(0) String arg0) {
		this.aString18 = arg0;
		if (this.aString18 == null) {
			this.aClass14_Sub27_Sub2_2 = null;
			return;
		}
		if (this.aClass14_Sub27_Sub2_2 != null && !this.aString18.equals(this.aClass14_Sub27_Sub2_2.method4489())) {
			this.aClass14_Sub27_Sub2_2 = null;
		}
		if (this.aClass14_Sub27_Sub2_2 != null) {
			return;
		}
		for (@Pc(50) Class14_Sub27 local50 = (Class14_Sub27) this.aClass187_16.method4079(); local50 != null; local50 = (Class14_Sub27) this.aClass187_16.method4084()) {
			if (local50 instanceof Class14_Sub27_Sub2) {
				@Pc(58) Class14_Sub27_Sub2 local58 = (Class14_Sub27_Sub2) local50;
				if (this.aString18.equals(local58.method4489())) {
					this.aClass14_Sub27_Sub2_2 = local58;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "(I)V")
	private void method1520() throws IOException {
		while (this.aClass14_Sub27_Sub1_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(11) Class14_Sub27 local11 = this.method1518();
			if (local11 == null) {
				if (this.aBoolean146) {
					this.method1527();
				}
				return;
			}
			if (local11 == this.aClass14_Sub27_Sub2_2) {
				this.method1530();
			}
		}
		this.aClass14_Sub27_Sub1_2.method9054(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "(I)Lclient!waa;")
	public final Class14_Sub27_Sub4 method1521() {
		return this.aClass14_Sub27_Sub4_2;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Z)V")
	public final void method1522() throws IOException {
		if (this.aBoolean147) {
			return;
		}
		while (!this.aBoolean148) {
			@Pc(34) Class14_Sub27 local34;
			if (this.aBoolean149) {
				local34 = (Class14_Sub27) this.aClass187_16.method4078((long) this.anOggPage2.getSerialNumber());
			} else {
				local34 = this.method1518();
				if (local34 == null) {
					if (this.aBoolean146) {
						this.method1527();
					}
					return;
				}
				if (local34 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean149 = true;
			}
			if (local34 == this.aClass14_Sub27_Sub4_2) {
				if (this.aClass14_Sub27_Sub4_2.method9056() >= 50) {
					return;
				}
				while (this.aClass14_Sub27_Sub4_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass14_Sub27_Sub4_2.method9054(this.anOggPacket2);
					this.method1530();
					if (this.aClass14_Sub27_Sub1_2 != null) {
						@Pc(154) double local154 = this.aClass14_Sub27_Sub1_2.method3734();
						for (@Pc(156) int local156 = 0; local156 < 10 && this.method1516(); local156++) {
							this.method1520();
							if (this.aBoolean148) {
								return;
							}
						}
						if (local154 < this.aClass14_Sub27_Sub1_2.method3734()) {
							return;
						}
					}
					if (this.aClass14_Sub27_Sub4_2.method9056() >= 50) {
						return;
					}
				}
			} else if (local34 instanceof Class14_Sub27_Sub2) {
				this.method1530();
			} else if (this.aClass14_Sub27_Sub1_2 != local34) {
				while (local34.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local34.anInt10860 == 1 && local34 instanceof Class14_Sub27_Sub2) {
						this.method1519(this.aString18);
					}
					local34.method9054(this.anOggPacket2);
				}
			} else if (this.aClass14_Sub27_Sub4_2 == null && !this.aBoolean147) {
				for (@Pc(107) int local107 = 0; local107 < 10 && this.method1516(); local107++) {
					this.method1520();
					if (this.aBoolean148) {
						return;
					}
				}
				return;
			}
			this.aBoolean149 = false;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(B)Lclient!kk;")
	public final Class14_Sub27_Sub2 method1524() {
		return this.aClass14_Sub27_Sub2_2;
	}

	@OriginalMember(owner = "client!oaa", name = "e", descriptor = "(I)Lclient!io;")
	public final Class14_Sub27_Sub1 method1525() {
		return this.aClass14_Sub27_Sub1_2;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IZ)V")
	public final void method1526(@OriginalArg(1) boolean arg0) {
		if (this.aClass14_Sub27_Sub4_2 != null) {
			@Pc(7) Class14_Sub5_Sub1 local7 = this.aClass14_Sub27_Sub4_2.method9055();
			if (local7 != null) {
				local7.method649(arg0);
			}
		}
		this.aBoolean147 = !this.aBoolean147;
	}

	@OriginalMember(owner = "client!oaa", name = "f", descriptor = "(I)V")
	private void method1527() {
		for (@Pc(11) Class14_Sub27 local11 = (Class14_Sub27) this.aClass187_16.method4079(); local11 != null; local11 = (Class14_Sub27) this.aClass187_16.method4084()) {
			if (local11 != this.aClass14_Sub27_Sub1_2) {
				while (local11.anOggStreamState5.packetOut() == 1) {
					local11.method9054(this.anOggPacket2);
				}
			}
		}
		if (this.aClass14_Sub27_Sub1_2 == null) {
			return;
		}
		for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
			if (!this.method1516()) {
				return;
			}
			if (this.aClass14_Sub27_Sub1_2.anOggStreamState5.packetOut() != 1) {
				this.method1531();
				return;
			}
			this.aClass14_Sub27_Sub1_2.method9054(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "([BZ)I")
	protected abstract int method1529(@OriginalArg(0) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "(B)V")
	private void method1530() {
		for (@Pc(15) Class14_Sub27 local15 = (Class14_Sub27) this.aClass187_16.method4079(); local15 != null; local15 = (Class14_Sub27) this.aClass187_16.method4084()) {
			if (local15 instanceof Class14_Sub27_Sub2) {
				@Pc(23) Class14_Sub27_Sub2 local23 = (Class14_Sub27_Sub2) local15;
				while ((local23.anInt10860 <= 8 || this.method1532() > (double) local23.method4485()) && local23.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local23.method9054(this.anOggPacket2);
				}
			}
		}
		this.method1519(this.aString18);
	}

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "(B)V")
	public final void method1531() {
		if (this.aBoolean148) {
			return;
		}
		for (@Pc(15) Class14_Sub27 local15 = (Class14_Sub27) this.aClass187_16.method4079(); local15 != null; local15 = (Class14_Sub27) this.aClass187_16.method4084()) {
			local15.method9051();
			local15.anOggStreamState5.b();
		}
		this.anOggPacket2.b();
		this.anOggPage2.b();
		this.anOggSyncState2.b();
		this.aBoolean148 = true;
	}

	@OriginalMember(owner = "client!oaa", name = "g", descriptor = "(I)D")
	public final double method1532() {
		if (this.aClass14_Sub27_Sub4_2 == null) {
			return this.aClass14_Sub27_Sub1_2 == null ? 0.0D : this.aClass14_Sub27_Sub1_2.method3734();
		} else {
			return this.aClass14_Sub27_Sub4_2.method9060();
		}
	}
}
