import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public abstract class Class207 {

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "Z")
	private boolean aBoolean719;

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "Ljava/lang/String;")
	private String aString111;

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "Z")
	private boolean aBoolean720;

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "Lclient!u;")
	private Class3_Sub14_Sub4 aClass3_Sub14_Sub4_2;

	@OriginalMember(owner = "client!lg", name = "p", descriptor = "Lclient!hb;")
	private Class3_Sub14_Sub3 aClass3_Sub14_Sub3_2;

	@OriginalMember(owner = "client!lg", name = "r", descriptor = "Z")
	private boolean aBoolean721;

	@OriginalMember(owner = "client!lg", name = "w", descriptor = "Lclient!gn;")
	private Class3_Sub14_Sub2 aClass3_Sub14_Sub2_2;

	@OriginalMember(owner = "client!lg", name = "y", descriptor = "Z")
	private boolean aBoolean722;

	@OriginalMember(owner = "client!lg", name = "o", descriptor = "[B")
	private final byte[] aByteArray95;

	@OriginalMember(owner = "client!lg", name = "v", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!lg", name = "D", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!lg", name = "t", descriptor = "Lclient!tca;")
	private final Class333 aClass333_43;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(I)V")
	protected Class207(@OriginalArg(0) int arg0) {
		if (!Static634.method5642("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray95 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass333_43 = new Class333(8);
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)V")
	public final void method8461() throws IOException {
		if (this.aBoolean719) {
			return;
		}
		while (!this.aBoolean720) {
			@Pc(16) Class3_Sub14 local16;
			if (this.aBoolean721) {
				local16 = (Class3_Sub14) this.aClass333_43.method7489((long) this.anOggPage2.getSerialNumber());
			} else {
				local16 = this.method8470();
				if (local16 == null) {
					if (this.aBoolean722) {
						this.method8463();
					}
					return;
				}
				if (local16 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean721 = true;
			}
			if (local16 == this.aClass3_Sub14_Sub2_2) {
				if (this.aClass3_Sub14_Sub2_2.method3082() >= 50) {
					return;
				}
				while (this.aClass3_Sub14_Sub2_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass3_Sub14_Sub2_2.method7819(this.anOggPacket2);
					this.method8462();
					if (this.aClass3_Sub14_Sub4_2 != null) {
						@Pc(76) double local76 = this.aClass3_Sub14_Sub4_2.method7822();
						for (@Pc(78) int local78 = 0; local78 < 10 && this.method8465(); local78++) {
							this.method8472();
							if (this.aBoolean720) {
								return;
							}
						}
						if (this.aClass3_Sub14_Sub4_2.method7822() > local76) {
							return;
						}
					}
					if (this.aClass3_Sub14_Sub2_2.method3082() >= 50) {
						return;
					}
				}
			} else if (local16 instanceof Class3_Sub14_Sub3) {
				this.method8462();
			} else if (local16 != this.aClass3_Sub14_Sub4_2) {
				while (local16.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local16.anInt9591 == 1 && local16 instanceof Class3_Sub14_Sub3) {
						this.method8476(this.aString111);
					}
					local16.method7819(this.anOggPacket2);
				}
			} else if (this.aClass3_Sub14_Sub2_2 == null && !this.aBoolean719) {
				for (@Pc(146) int local146 = 0; local146 < 10 && this.method8465(); local146++) {
					this.method8472();
					if (this.aBoolean720) {
						return;
					}
				}
				return;
			}
			this.aBoolean721 = false;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	private void method8462() {
		for (@Pc(13) Class3_Sub14 local13 = (Class3_Sub14) this.aClass333_43.method7490(); local13 != null; local13 = (Class3_Sub14) this.aClass333_43.method7487()) {
			if (local13 instanceof Class3_Sub14_Sub3) {
				@Pc(21) Class3_Sub14_Sub3 local21 = (Class3_Sub14_Sub3) local13;
				while ((local21.anInt9591 <= 8 || this.method8467() > (double) local21.method3188()) && local21.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local21.method7819(this.anOggPacket2);
				}
			}
		}
		this.method8476(this.aString111);
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
	private void method8463() {
		for (@Pc(15) Class3_Sub14 local15 = (Class3_Sub14) this.aClass333_43.method7490(); local15 != null; local15 = (Class3_Sub14) this.aClass333_43.method7487()) {
			if (local15 != this.aClass3_Sub14_Sub4_2) {
				while (local15.anOggStreamState5.packetOut() == 1) {
					local15.method7819(this.anOggPacket2);
				}
			}
		}
		if (this.aClass3_Sub14_Sub4_2 == null) {
			return;
		}
		for (@Pc(47) int local47 = 0; local47 < 10; local47++) {
			if (!this.method8465()) {
				return;
			}
			if (this.aClass3_Sub14_Sub4_2.anOggStreamState5.packetOut() != 1) {
				this.method8466();
				return;
			}
			this.aClass3_Sub14_Sub4_2.method7819(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)Z")
	private boolean method8465() {
		if (this.aClass3_Sub14_Sub2_2 == null) {
			@Pc(16) double local16 = (double) this.aClass3_Sub14_Sub4_2.method7825();
			return local16 == 0.0D || (double) Static15.method380() >= (double) this.aClass3_Sub14_Sub4_2.method7823() + 1000.0D / local16;
		} else {
			return !this.aClass3_Sub14_Sub4_2.method7824() || this.method8467() > this.aClass3_Sub14_Sub4_2.method7822();
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V")
	public final void method8466() {
		if (this.aBoolean720) {
			return;
		}
		for (@Pc(13) Class3_Sub14 local13 = (Class3_Sub14) this.aClass333_43.method7490(); local13 != null; local13 = (Class3_Sub14) this.aClass333_43.method7487()) {
			local13.method7818();
			local13.anOggStreamState5.b();
		}
		this.anOggPacket2.b();
		this.anOggPage2.b();
		this.anOggSyncState2.b();
		this.aBoolean720 = true;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(Z)D")
	public final double method8467() {
		if (this.aClass3_Sub14_Sub2_2 == null) {
			return this.aClass3_Sub14_Sub4_2 == null ? 0.0D : this.aClass3_Sub14_Sub4_2.method7822();
		} else {
			return this.aClass3_Sub14_Sub2_2.method3085();
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)V")
	public final void method8468(@OriginalArg(1) boolean arg0) {
		if (this.aClass3_Sub14_Sub2_2 != null) {
			@Pc(11) Class3_Sub12_Sub5 local11 = this.aClass3_Sub14_Sub2_2.method3086();
			if (local11 != null) {
				local11.method8954(arg0);
			}
		}
		this.aBoolean719 = !this.aBoolean719;
	}

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)Z")
	public final boolean method8469() {
		if (this.aBoolean720 || this.aBoolean722) {
			return this.aClass3_Sub14_Sub2_2 == null || this.aClass3_Sub14_Sub2_2.method3082() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(B)Lclient!qha;")
	private Class3_Sub14 method8470() throws IOException {
		if (this.aBoolean720) {
			throw new IllegalStateException();
		} else if (this.aBoolean722) {
			return null;
		} else {
			@Pc(23) int local23;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local23 = this.method8475(this.aByteArray95);
				if (local23 == -1) {
					this.aBoolean722 = true;
					return null;
				}
				if (local23 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray95, local23)) {
					throw new RuntimeException("");
				}
			}
			local23 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(196) Class3_Sub14 local196 = (Class3_Sub14) this.aClass333_43.method7489((long) local23);
				if (!local196.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local196;
			}
			@Pc(71) OggStreamState local71 = new OggStreamState(local23);
			if (!local71.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local71.packetPeek(this.anOggPacket2) == 1) {
				@Pc(106) Class3_Sub14 local106;
				if (this.aClass3_Sub14_Sub4_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass3_Sub14_Sub4_2 = new Class3_Sub14_Sub4(local71);
					local106 = this.aClass3_Sub14_Sub4_2;
				} else if (this.aClass3_Sub14_Sub2_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass3_Sub14_Sub2_2 = new Class3_Sub14_Sub2(local71);
					local106 = this.aClass3_Sub14_Sub2_2;
				} else {
					@Pc(119) byte[] local119 = this.anOggPacket2.getData();
					@Pc(123) StringBuffer local123 = new StringBuffer();
					for (@Pc(125) int local125 = 1; local125 < local119.length && Character.isLetterOrDigit((char) local119[local125]); local125++) {
						local123.append((char) local119[local125]);
					}
					@Pc(152) String local152 = local123.toString();
					if (local152.equals("kate")) {
						local106 = new Class3_Sub14_Sub3(local71);
					} else {
						local106 = new Class3_Sub14_Sub1(local71);
					}
				}
				this.aClass333_43.method7488((long) local23, local106);
				return local106;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "(B)Lclient!u;")
	public final Class3_Sub14_Sub4 method8471() {
		return this.aClass3_Sub14_Sub4_2;
	}

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "(I)V")
	private void method8472() throws IOException {
		while (this.aClass3_Sub14_Sub4_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(19) Class3_Sub14 local19 = this.method8470();
			if (local19 == null) {
				if (this.aBoolean722) {
					this.method8463();
				}
				return;
			}
			if (local19 == this.aClass3_Sub14_Sub3_2) {
				this.method8462();
			}
		}
		this.aClass3_Sub14_Sub4_2.method7819(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "(I)Lclient!hb;")
	public final Class3_Sub14_Sub3 method8473() {
		return this.aClass3_Sub14_Sub3_2;
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(Z)Lclient!gn;")
	public final Class3_Sub14_Sub2 method8474() {
		return this.aClass3_Sub14_Sub2_2;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I[B)I")
	protected abstract int method8475(@OriginalArg(1) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method8476(@OriginalArg(0) String arg0) {
		this.aString111 = arg0;
		if (this.aString111 == null) {
			this.aClass3_Sub14_Sub3_2 = null;
			return;
		}
		if (this.aClass3_Sub14_Sub3_2 != null && !this.aString111.equals(this.aClass3_Sub14_Sub3_2.method3186())) {
			this.aClass3_Sub14_Sub3_2 = null;
		}
		if (this.aClass3_Sub14_Sub3_2 != null) {
			return;
		}
		for (@Pc(46) Class3_Sub14 local46 = (Class3_Sub14) this.aClass333_43.method7490(); local46 != null; local46 = (Class3_Sub14) this.aClass333_43.method7487()) {
			if (local46 instanceof Class3_Sub14_Sub3) {
				@Pc(54) Class3_Sub14_Sub3 local54 = (Class3_Sub14_Sub3) local46;
				if (this.aString111.equals(local54.method3186())) {
					this.aClass3_Sub14_Sub3_2 = local54;
					return;
				}
			}
		}
	}
}
