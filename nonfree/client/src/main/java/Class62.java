import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dfa")
public abstract class Class62 {

	@OriginalMember(owner = "client!dfa", name = "f", descriptor = "Ljava/lang/String;")
	private String aString113;

	@OriginalMember(owner = "client!dfa", name = "g", descriptor = "Lclient!ku;")
	private Class6_Sub13_Sub3 aClass6_Sub13_Sub3_2;

	@OriginalMember(owner = "client!dfa", name = "j", descriptor = "Lclient!hq;")
	private Class6_Sub13_Sub2 aClass6_Sub13_Sub2_2;

	@OriginalMember(owner = "client!dfa", name = "t", descriptor = "Z")
	private boolean aBoolean680;

	@OriginalMember(owner = "client!dfa", name = "y", descriptor = "Z")
	private boolean aBoolean681;

	@OriginalMember(owner = "client!dfa", name = "z", descriptor = "Z")
	private boolean aBoolean682;

	@OriginalMember(owner = "client!dfa", name = "C", descriptor = "Z")
	private boolean aBoolean683;

	@OriginalMember(owner = "client!dfa", name = "E", descriptor = "Lclient!ea;")
	private Class6_Sub13_Sub1 aClass6_Sub13_Sub1_2;

	@OriginalMember(owner = "client!dfa", name = "h", descriptor = "[B")
	private final byte[] aByteArray112;

	@OriginalMember(owner = "client!dfa", name = "D", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!dfa", name = "x", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!dfa", name = "l", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!dfa", name = "A", descriptor = "Lclient!he;")
	private final Class128 aClass128_48;

	@OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(I)V")
	protected Class62(@OriginalArg(0) int arg0) {
		if (!Static96.method1571("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray112 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass128_48 = new Class128(8);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IZ)V")
	public final void method8467(@OriginalArg(1) boolean arg0) {
		if (this.aClass6_Sub13_Sub2_2 != null) {
			@Pc(18) Class6_Sub3_Sub2 local18 = this.aClass6_Sub13_Sub2_2.method3754();
			if (local18 != null) {
				local18.method3693(arg0);
			}
		}
		this.aBoolean683 = !this.aBoolean683;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)V")
	private void method8468() {
		for (@Pc(11) Class6_Sub13 local11 = (Class6_Sub13) this.aClass128_48.method3556(); local11 != null; local11 = (Class6_Sub13) this.aClass128_48.method3555()) {
			if (local11 instanceof Class6_Sub13_Sub3) {
				@Pc(24) Class6_Sub13_Sub3 local24 = (Class6_Sub13_Sub3) local11;
				while ((local24.anInt8013 <= 8 || this.method8473() > (double) local24.method5138()) && local24.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local24.method6908(this.anOggPacket2);
				}
			}
		}
		this.method8474(this.aString113);
	}

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "(I)V")
	private void method8469() throws IOException {
		while (this.aClass6_Sub13_Sub1_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(11) Class6_Sub13 local11 = this.method8471();
			if (local11 == null) {
				if (this.aBoolean682) {
					this.method8481();
				}
				return;
			}
			if (local11 == this.aClass6_Sub13_Sub3_2) {
				this.method8468();
			}
		}
		this.aClass6_Sub13_Sub1_2.method6908(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!dfa", name = "c", descriptor = "(I)Z")
	private boolean method8470() {
		if (this.aClass6_Sub13_Sub2_2 == null) {
			@Pc(37) double local37 = (double) this.aClass6_Sub13_Sub1_2.method1907();
			return local37 == 0.0D || (double) Static32.method595() >= 1000.0D / local37 + (double) this.aClass6_Sub13_Sub1_2.method1908();
		} else {
			return !this.aClass6_Sub13_Sub1_2.method1916() || this.method8473() > this.aClass6_Sub13_Sub1_2.method1914();
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B)Lclient!dn;")
	private Class6_Sub13 method8471() throws IOException {
		if (this.aBoolean681) {
			throw new IllegalStateException();
		} else if (this.aBoolean682) {
			return null;
		} else {
			@Pc(31) int local31;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local31 = this.method8480(this.aByteArray112);
				if (local31 == -1) {
					this.aBoolean682 = true;
					return null;
				}
				if (local31 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray112, local31)) {
					throw new RuntimeException("");
				}
			}
			local31 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(202) Class6_Sub13 local202 = (Class6_Sub13) this.aClass128_48.method3560((long) local31);
				if (!local202.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local202;
			}
			@Pc(77) OggStreamState local77 = new OggStreamState(local31);
			if (!local77.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local77.packetPeek(this.anOggPacket2) == 1) {
				@Pc(112) Class6_Sub13 local112;
				if (this.aClass6_Sub13_Sub1_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass6_Sub13_Sub1_2 = new Class6_Sub13_Sub1(local77);
					local112 = this.aClass6_Sub13_Sub1_2;
				} else if (this.aClass6_Sub13_Sub2_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass6_Sub13_Sub2_2 = new Class6_Sub13_Sub2(local77);
					local112 = this.aClass6_Sub13_Sub2_2;
				} else {
					@Pc(125) byte[] local125 = this.anOggPacket2.getData();
					@Pc(129) StringBuffer local129 = new StringBuffer();
					for (@Pc(131) int local131 = 1; local131 < local125.length && Character.isLetterOrDigit((char) local125[local131]); local131++) {
						local129.append((char) local125[local131]);
					}
					@Pc(158) String local158 = local129.toString();
					if (local158.equals("kate")) {
						local112 = new Class6_Sub13_Sub3(local77);
					} else {
						local112 = new Class6_Sub13_Sub4(local77);
					}
				}
				this.aClass128_48.method3551((long) local31, local112);
				return local112;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!dfa", name = "d", descriptor = "(I)Lclient!ku;")
	public final Class6_Sub13_Sub3 method8472() {
		return this.aClass6_Sub13_Sub3_2;
	}

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "(B)D")
	public final double method8473() {
		if (this.aClass6_Sub13_Sub2_2 == null) {
			return this.aClass6_Sub13_Sub1_2 == null ? 0.0D : this.aClass6_Sub13_Sub1_2.method1914();
		} else {
			return this.aClass6_Sub13_Sub2_2.method3752();
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method8474(@OriginalArg(1) String arg0) {
		this.aString113 = arg0;
		if (this.aString113 == null) {
			this.aClass6_Sub13_Sub3_2 = null;
			return;
		}
		if (this.aClass6_Sub13_Sub3_2 != null && !this.aString113.equals(this.aClass6_Sub13_Sub3_2.method5140())) {
			this.aClass6_Sub13_Sub3_2 = null;
		}
		if (this.aClass6_Sub13_Sub3_2 != null) {
			return;
		}
		for (@Pc(42) Class6_Sub13 local42 = (Class6_Sub13) this.aClass128_48.method3556(); local42 != null; local42 = (Class6_Sub13) this.aClass128_48.method3555()) {
			if (local42 instanceof Class6_Sub13_Sub3) {
				@Pc(50) Class6_Sub13_Sub3 local50 = (Class6_Sub13_Sub3) local42;
				if (this.aString113.equals(local50.method5140())) {
					this.aClass6_Sub13_Sub3_2 = local50;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dfa", name = "e", descriptor = "(I)V")
	public final void method8475() throws IOException {
		if (this.aBoolean683) {
			return;
		}
		while (!this.aBoolean681) {
			@Pc(20) Class6_Sub13 local20;
			if (this.aBoolean680) {
				local20 = (Class6_Sub13) this.aClass128_48.method3560((long) this.anOggPage2.getSerialNumber());
			} else {
				local20 = this.method8471();
				if (local20 == null) {
					if (this.aBoolean682) {
						this.method8481();
					}
					return;
				}
				if (local20 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean680 = true;
			}
			if (local20 == this.aClass6_Sub13_Sub2_2) {
				if (this.aClass6_Sub13_Sub2_2.method3751() >= 50) {
					return;
				}
				while (this.aClass6_Sub13_Sub2_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass6_Sub13_Sub2_2.method6908(this.anOggPacket2);
					this.method8468();
					if (this.aClass6_Sub13_Sub1_2 != null) {
						@Pc(146) double local146 = this.aClass6_Sub13_Sub1_2.method1914();
						for (@Pc(148) int local148 = 0; local148 < 10 && this.method8470(); local148++) {
							this.method8469();
							if (this.aBoolean681) {
								return;
							}
						}
						if (local146 < this.aClass6_Sub13_Sub1_2.method1914()) {
							return;
						}
					}
					if (this.aClass6_Sub13_Sub2_2.method3751() >= 50) {
						return;
					}
				}
			} else if (local20 instanceof Class6_Sub13_Sub3) {
				this.method8468();
			} else if (local20 != this.aClass6_Sub13_Sub1_2) {
				while (local20.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local20.anInt8013 == 1 && local20 instanceof Class6_Sub13_Sub3) {
						this.method8474(this.aString113);
					}
					local20.method6908(this.anOggPacket2);
				}
			} else if (this.aClass6_Sub13_Sub2_2 == null && !this.aBoolean683) {
				for (@Pc(102) int local102 = 0; local102 < 10 && this.method8470(); local102++) {
					this.method8469();
					if (this.aBoolean681) {
						return;
					}
				}
				return;
			}
			this.aBoolean680 = false;
		}
	}

	@OriginalMember(owner = "client!dfa", name = "f", descriptor = "(I)Lclient!ea;")
	public final Class6_Sub13_Sub1 method8476() {
		return this.aClass6_Sub13_Sub1_2;
	}

	@OriginalMember(owner = "client!dfa", name = "g", descriptor = "(I)V")
	public final void method8478() {
		if (this.aBoolean681) {
			return;
		}
		for (@Pc(15) Class6_Sub13 local15 = (Class6_Sub13) this.aClass128_48.method3556(); local15 != null; local15 = (Class6_Sub13) this.aClass128_48.method3555()) {
			local15.method6910();
			local15.anOggStreamState5.b();
		}
		this.anOggPacket2.b();
		this.anOggPage2.b();
		this.anOggSyncState2.b();
		this.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!dfa", name = "h", descriptor = "(I)Lclient!hq;")
	public final Class6_Sub13_Sub2 method8479() {
		return this.aClass6_Sub13_Sub2_2;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "([BB)I")
	protected abstract int method8480(@OriginalArg(0) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!dfa", name = "i", descriptor = "(I)V")
	private void method8481() {
		for (@Pc(11) Class6_Sub13 local11 = (Class6_Sub13) this.aClass128_48.method3556(); local11 != null; local11 = (Class6_Sub13) this.aClass128_48.method3555()) {
			if (local11 != this.aClass6_Sub13_Sub1_2) {
				while (local11.anOggStreamState5.packetOut() == 1) {
					local11.method6908(this.anOggPacket2);
				}
			}
		}
		if (this.aClass6_Sub13_Sub1_2 == null) {
			return;
		}
		for (@Pc(50) int local50 = 0; local50 < 10; local50++) {
			if (!this.method8470()) {
				return;
			}
			if (this.aClass6_Sub13_Sub1_2.anOggStreamState5.packetOut() != 1) {
				this.method8478();
				return;
			}
			this.aClass6_Sub13_Sub1_2.method6908(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!dfa", name = "j", descriptor = "(I)Z")
	public final boolean method8482() {
		if (this.aBoolean681 || this.aBoolean682) {
			return this.aClass6_Sub13_Sub2_2 == null || this.aClass6_Sub13_Sub2_2.method3751() <= 0;
		} else {
			return false;
		}
	}
}
