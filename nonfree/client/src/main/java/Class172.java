import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public abstract class Class172 {

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "Z")
	private boolean aBoolean578;

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "Lclient!jaa;")
	private Class3_Sub23_Sub2 aClass3_Sub23_Sub2_2;

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "Lclient!uc;")
	private Class3_Sub23_Sub4 aClass3_Sub23_Sub4_2;

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "Z")
	private boolean aBoolean579;

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "Lclient!ij;")
	private Class3_Sub23_Sub1 aClass3_Sub23_Sub1_2;

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "Z")
	private boolean aBoolean580;

	@OriginalMember(owner = "client!jf", name = "y", descriptor = "Z")
	private boolean aBoolean582;

	@OriginalMember(owner = "client!jf", name = "C", descriptor = "Ljava/lang/String;")
	private String aString72;

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "[B")
	private final byte[] aByteArray83;

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!jf", name = "A", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "Lclient!baa;")
	private final Class25 aClass25_35;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(I)V")
	protected Class172(@OriginalArg(0) int arg0) {
		if (!Static422.method6653("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray83 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass25_35 = new Class25(8);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	public final void method7038() throws IOException {
		if (this.aBoolean582) {
			return;
		}
		while (!this.aBoolean580) {
			@Pc(20) Class3_Sub23 local20;
			if (this.aBoolean579) {
				local20 = (Class3_Sub23) this.aClass25_35.method426((long) this.anOggPage2.getSerialNumber());
			} else {
				local20 = this.method7043();
				if (local20 == null) {
					if (this.aBoolean578) {
						this.method7039();
					}
					return;
				}
				if (local20 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean579 = true;
			}
			if (local20 == this.aClass3_Sub23_Sub2_2) {
				if (this.aClass3_Sub23_Sub2_2.method4280() >= 50) {
					return;
				}
				while (this.aClass3_Sub23_Sub2_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass3_Sub23_Sub2_2.method7998(this.anOggPacket2);
					this.method7047();
					if (this.aClass3_Sub23_Sub4_2 != null) {
						@Pc(148) double local148 = this.aClass3_Sub23_Sub4_2.method8004();
						for (@Pc(150) int local150 = 0; local150 < 10 && this.method7053(); local150++) {
							this.method7050();
							if (this.aBoolean580) {
								return;
							}
						}
						if (local148 < this.aClass3_Sub23_Sub4_2.method8004()) {
							return;
						}
					}
					if (this.aClass3_Sub23_Sub2_2.method4280() >= 50) {
						return;
					}
				}
			} else if (local20 instanceof Class3_Sub23_Sub1) {
				this.method7047();
			} else if (this.aClass3_Sub23_Sub4_2 != local20) {
				while (local20.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local20.anInt9343 == 1 && local20 instanceof Class3_Sub23_Sub1) {
						this.method7041(this.aString72);
					}
					local20.method7998(this.anOggPacket2);
				}
			} else if (this.aClass3_Sub23_Sub2_2 == null && !this.aBoolean582) {
				for (@Pc(104) int local104 = 0; local104 < 10 && this.method7053(); local104++) {
					this.method7050();
					if (this.aBoolean580) {
						return;
					}
				}
				return;
			}
			this.aBoolean579 = false;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	private void method7039() {
		for (@Pc(15) Class3_Sub23 local15 = (Class3_Sub23) this.aClass25_35.method435(); local15 != null; local15 = (Class3_Sub23) this.aClass25_35.method432()) {
			if (this.aClass3_Sub23_Sub4_2 != local15) {
				while (local15.anOggStreamState5.packetOut() == 1) {
					local15.method7998(this.anOggPacket2);
				}
			}
		}
		if (this.aClass3_Sub23_Sub4_2 == null) {
			return;
		}
		for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
			if (!this.method7053()) {
				return;
			}
			if (this.aClass3_Sub23_Sub4_2.anOggStreamState5.packetOut() != 1) {
				this.method7040();
				return;
			}
			this.aClass3_Sub23_Sub4_2.method7998(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
	public final void method7040() {
		if (this.aBoolean580) {
			return;
		}
		for (@Pc(15) Class3_Sub23 local15 = (Class3_Sub23) this.aClass25_35.method435(); local15 != null; local15 = (Class3_Sub23) this.aClass25_35.method432()) {
			local15.method7994();
			local15.anOggStreamState5.b();
		}
		this.anOggPacket2.b();
		this.anOggPage2.b();
		this.anOggSyncState2.b();
		this.aBoolean580 = true;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method7041(@OriginalArg(1) String arg0) {
		this.aString72 = arg0;
		if (this.aString72 == null) {
			this.aClass3_Sub23_Sub1_2 = null;
			return;
		}
		if (this.aClass3_Sub23_Sub1_2 != null && !this.aString72.equals(this.aClass3_Sub23_Sub1_2.method4092())) {
			this.aClass3_Sub23_Sub1_2 = null;
		}
		if (this.aClass3_Sub23_Sub1_2 != null) {
			return;
		}
		for (@Pc(44) Class3_Sub23 local44 = (Class3_Sub23) this.aClass25_35.method435(); local44 != null; local44 = (Class3_Sub23) this.aClass25_35.method432()) {
			if (local44 instanceof Class3_Sub23_Sub1) {
				@Pc(52) Class3_Sub23_Sub1 local52 = (Class3_Sub23_Sub1) local44;
				if (this.aString72.equals(local52.method4092())) {
					this.aClass3_Sub23_Sub1_2 = local52;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "([BI)I")
	protected abstract int method7042(@OriginalArg(0) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)Lclient!pl;")
	private Class3_Sub23 method7043() throws IOException {
		if (this.aBoolean580) {
			throw new IllegalStateException();
		} else if (this.aBoolean578) {
			return null;
		} else {
			@Pc(28) int local28;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local28 = this.method7042(this.aByteArray83);
				if (local28 == -1) {
					this.aBoolean578 = true;
					return null;
				}
				if (local28 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray83, local28)) {
					throw new RuntimeException("");
				}
			}
			local28 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(197) Class3_Sub23 local197 = (Class3_Sub23) this.aClass25_35.method426((long) local28);
				if (!local197.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local197;
			}
			@Pc(74) OggStreamState local74 = new OggStreamState(local28);
			if (!local74.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local74.packetPeek(this.anOggPacket2) == 1) {
				@Pc(111) Class3_Sub23 local111;
				if (this.aClass3_Sub23_Sub4_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass3_Sub23_Sub4_2 = new Class3_Sub23_Sub4(local74);
					local111 = this.aClass3_Sub23_Sub4_2;
				} else if (this.aClass3_Sub23_Sub2_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass3_Sub23_Sub2_2 = new Class3_Sub23_Sub2(local74);
					local111 = this.aClass3_Sub23_Sub2_2;
				} else {
					@Pc(135) byte[] local135 = this.anOggPacket2.getData();
					@Pc(139) StringBuffer local139 = new StringBuffer();
					for (@Pc(141) int local141 = 1; local141 < local135.length && Character.isLetterOrDigit((char) local135[local141]); local141++) {
						local139.append((char) local135[local141]);
					}
					@Pc(164) String local164 = local139.toString();
					if (local164.equals("kate")) {
						local111 = new Class3_Sub23_Sub1(local74);
					} else {
						local111 = new Class3_Sub23_Sub3(local74);
					}
				}
				this.aClass25_35.method434((long) local28, local111);
				return local111;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)Z")
	public final boolean method7044() {
		if (this.aBoolean580 || this.aBoolean578) {
			return this.aClass3_Sub23_Sub2_2 == null || this.aClass3_Sub23_Sub2_2.method4280() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)Lclient!uc;")
	public final Class3_Sub23_Sub4 method7045() {
		return this.aClass3_Sub23_Sub4_2;
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)D")
	public final double method7046() {
		if (this.aClass3_Sub23_Sub2_2 == null) {
			return this.aClass3_Sub23_Sub4_2 == null ? 0.0D : this.aClass3_Sub23_Sub4_2.method8004();
		} else {
			return this.aClass3_Sub23_Sub2_2.method4281();
		}
	}

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "(I)V")
	private void method7047() {
		for (@Pc(15) Class3_Sub23 local15 = (Class3_Sub23) this.aClass25_35.method435(); local15 != null; local15 = (Class3_Sub23) this.aClass25_35.method432()) {
			if (local15 instanceof Class3_Sub23_Sub1) {
				@Pc(23) Class3_Sub23_Sub1 local23 = (Class3_Sub23_Sub1) local15;
				while ((local23.anInt9343 <= 8 || this.method7046() > (double) local23.method4095()) && local23.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local23.method7998(this.anOggPacket2);
				}
			}
		}
		this.method7041(this.aString72);
	}

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "(I)Lclient!jaa;")
	public final Class3_Sub23_Sub2 method7049() {
		return this.aClass3_Sub23_Sub2_2;
	}

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "(I)V")
	private void method7050() throws IOException {
		while (this.aClass3_Sub23_Sub4_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(16) Class3_Sub23 local16 = this.method7043();
			if (local16 == null) {
				if (this.aBoolean578) {
					this.method7039();
				}
				return;
			}
			if (local16 == this.aClass3_Sub23_Sub1_2) {
				this.method7047();
			}
		}
		this.aClass3_Sub23_Sub4_2.method7998(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZ)V")
	public final void method7051(@OriginalArg(1) boolean arg0) {
		if (this.aClass3_Sub23_Sub2_2 != null) {
			@Pc(7) Class3_Sub3_Sub2 local7 = this.aClass3_Sub23_Sub2_2.method4284();
			if (local7 != null) {
				local7.method2571(arg0);
			}
		}
		this.aBoolean582 = !this.aBoolean582;
	}

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "(I)Lclient!ij;")
	public final Class3_Sub23_Sub1 method7052() {
		return this.aClass3_Sub23_Sub1_2;
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(B)Z")
	private boolean method7053() {
		if (this.aClass3_Sub23_Sub2_2 == null) {
			@Pc(17) double local17 = (double) this.aClass3_Sub23_Sub4_2.method8002();
			return local17 == 0.0D || (double) Static191.method3071() >= (double) this.aClass3_Sub23_Sub4_2.method8003() + 1000.0D / local17;
		} else {
			return !this.aClass3_Sub23_Sub4_2.method8000() || this.method7046() > this.aClass3_Sub23_Sub4_2.method8004();
		}
	}
}
