import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public abstract class Class140 {

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "Lclient!et;")
	private Class5_Sub9_Sub1 aClass5_Sub9_Sub1_2;

	@OriginalMember(owner = "client!gq", name = "k", descriptor = "Z")
	private boolean aBoolean724;

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "Lclient!uh;")
	private Class5_Sub9_Sub4 aClass5_Sub9_Sub4_2;

	@OriginalMember(owner = "client!gq", name = "r", descriptor = "Z")
	private boolean aBoolean725;

	@OriginalMember(owner = "client!gq", name = "w", descriptor = "Z")
	private boolean aBoolean726;

	@OriginalMember(owner = "client!gq", name = "y", descriptor = "Ljava/lang/String;")
	private String aString81;

	@OriginalMember(owner = "client!gq", name = "C", descriptor = "Lclient!sm;")
	private Class5_Sub9_Sub2 aClass5_Sub9_Sub2_2;

	@OriginalMember(owner = "client!gq", name = "D", descriptor = "Z")
	private boolean aBoolean727;

	@OriginalMember(owner = "client!gq", name = "j", descriptor = "[B")
	private final byte[] aByteArray79;

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!gq", name = "z", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!gq", name = "t", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!gq", name = "v", descriptor = "Lclient!rda;")
	private final Class300 aClass300_39;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(I)V")
	protected Class140(@OriginalArg(0) int arg0) {
		if (!Static278.method4508("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray79 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass300_39 = new Class300(8);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V")
	public final void method7244() throws IOException {
		if (this.aBoolean727) {
			return;
		}
		while (!this.aBoolean726) {
			@Pc(28) Class5_Sub9 local28;
			if (this.aBoolean725) {
				local28 = (Class5_Sub9) this.aClass300_39.method7188((long) this.anOggPage2.getSerialNumber());
			} else {
				local28 = this.method7252();
				if (local28 == null) {
					if (this.aBoolean724) {
						this.method7247();
					}
					return;
				}
				if (local28 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean725 = true;
			}
			if (this.aClass5_Sub9_Sub1_2 == local28) {
				if (this.aClass5_Sub9_Sub1_2.method2743() >= 50) {
					return;
				}
				while (this.aClass5_Sub9_Sub1_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass5_Sub9_Sub1_2.method8198(this.anOggPacket2);
					this.method7256();
					if (this.aClass5_Sub9_Sub2_2 != null) {
						@Pc(150) double local150 = this.aClass5_Sub9_Sub2_2.method7638();
						for (@Pc(152) int local152 = 0; local152 < 10 && this.method7245(); local152++) {
							this.method7253();
							if (this.aBoolean726) {
								return;
							}
						}
						if (local150 < this.aClass5_Sub9_Sub2_2.method7638()) {
							return;
						}
					}
					if (this.aClass5_Sub9_Sub1_2.method2743() >= 50) {
						return;
					}
				}
			} else if (local28 instanceof Class5_Sub9_Sub4) {
				this.method7256();
			} else if (local28 != this.aClass5_Sub9_Sub2_2) {
				while (local28.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local28.anInt9828 == 1 && local28 instanceof Class5_Sub9_Sub4) {
						this.method7251(this.aString81);
					}
					local28.method8198(this.anOggPacket2);
				}
			} else if (this.aClass5_Sub9_Sub1_2 == null && !this.aBoolean727) {
				for (@Pc(106) int local106 = 0; local106 < 10 && this.method7245(); local106++) {
					this.method7253();
					if (this.aBoolean726) {
						return;
					}
				}
				return;
			}
			this.aBoolean725 = false;
		}
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)Z")
	private boolean method7245() {
		if (this.aClass5_Sub9_Sub1_2 == null) {
			@Pc(38) double local38 = (double) this.aClass5_Sub9_Sub2_2.method7636();
			return local38 == 0.0D || (double) Static547.method7619() >= 1000.0D / local38 + (double) this.aClass5_Sub9_Sub2_2.method7632();
		} else {
			return !this.aClass5_Sub9_Sub2_2.method7634() || this.method7250() > this.aClass5_Sub9_Sub2_2.method7638();
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)Lclient!sm;")
	public final Class5_Sub9_Sub2 method7246() {
		return this.aClass5_Sub9_Sub2_2;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
	private void method7247() {
		for (@Pc(11) Class5_Sub9 local11 = (Class5_Sub9) this.aClass300_39.method7182(); local11 != null; local11 = (Class5_Sub9) this.aClass300_39.method7192()) {
			if (this.aClass5_Sub9_Sub2_2 != local11) {
				while (local11.anOggStreamState5.packetOut() == 1) {
					local11.method8198(this.anOggPacket2);
				}
			}
		}
		if (this.aClass5_Sub9_Sub2_2 == null) {
			return;
		}
		for (@Pc(45) int local45 = 0; local45 < 10; local45++) {
			if (!this.method7245()) {
				return;
			}
			if (this.aClass5_Sub9_Sub2_2.anOggStreamState5.packetOut() != 1) {
				this.method7260();
				return;
			}
			this.aClass5_Sub9_Sub2_2.method8198(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)D")
	public final double method7250() {
		if (this.aClass5_Sub9_Sub1_2 == null) {
			return this.aClass5_Sub9_Sub2_2 == null ? 0.0D : this.aClass5_Sub9_Sub2_2.method7638();
		} else {
			return this.aClass5_Sub9_Sub1_2.method2742();
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method7251(@OriginalArg(0) String arg0) {
		this.aString81 = arg0;
		if (this.aString81 == null) {
			this.aClass5_Sub9_Sub4_2 = null;
			return;
		}
		if (this.aClass5_Sub9_Sub4_2 != null && !this.aString81.equals(this.aClass5_Sub9_Sub4_2.method8206())) {
			this.aClass5_Sub9_Sub4_2 = null;
		}
		if (this.aClass5_Sub9_Sub4_2 != null) {
			return;
		}
		for (@Pc(36) Class5_Sub9 local36 = (Class5_Sub9) this.aClass300_39.method7182(); local36 != null; local36 = (Class5_Sub9) this.aClass300_39.method7192()) {
			if (local36 instanceof Class5_Sub9_Sub4) {
				@Pc(43) Class5_Sub9_Sub4 local43 = (Class5_Sub9_Sub4) local36;
				if (this.aString81.equals(local43.method8206())) {
					this.aClass5_Sub9_Sub4_2 = local43;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(B)Lclient!bk;")
	private Class5_Sub9 method7252() throws IOException {
		if (this.aBoolean726) {
			throw new IllegalStateException();
		} else if (this.aBoolean724) {
			return null;
		} else {
			@Pc(30) int local30;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local30 = this.method7257(this.aByteArray79);
				if (local30 == -1) {
					this.aBoolean724 = true;
					return null;
				}
				if (local30 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray79, local30)) {
					throw new RuntimeException("");
				}
			}
			local30 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(77) Class5_Sub9 local77 = (Class5_Sub9) this.aClass300_39.method7188((long) local30);
				if (!local77.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local77;
			}
			@Pc(94) OggStreamState local94 = new OggStreamState(local30);
			if (!local94.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local94.packetPeek(this.anOggPacket2) == 1) {
				@Pc(138) Class5_Sub9 local138;
				if (this.aClass5_Sub9_Sub2_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass5_Sub9_Sub2_2 = new Class5_Sub9_Sub2(local94);
					local138 = this.aClass5_Sub9_Sub2_2;
				} else if (this.aClass5_Sub9_Sub1_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass5_Sub9_Sub1_2 = new Class5_Sub9_Sub1(local94);
					local138 = this.aClass5_Sub9_Sub1_2;
				} else {
					@Pc(144) byte[] local144 = this.anOggPacket2.getData();
					@Pc(148) StringBuffer local148 = new StringBuffer();
					for (@Pc(150) int local150 = 1; local150 < local144.length && Character.isLetterOrDigit((char) local144[local150]); local150++) {
						local148.append((char) local144[local150]);
					}
					@Pc(173) String local173 = local148.toString();
					if (local173.equals("kate")) {
						local138 = new Class5_Sub9_Sub4(local94);
					} else {
						local138 = new Class5_Sub9_Sub3(local94);
					}
				}
				this.aClass300_39.method7191(local138, (long) local30);
				return local138;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)V")
	private void method7253() throws IOException {
		while (this.aClass5_Sub9_Sub2_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(13) Class5_Sub9 local13 = this.method7252();
			if (local13 == null) {
				if (this.aBoolean724) {
					this.method7247();
				}
				return;
			}
			if (this.aClass5_Sub9_Sub4_2 == local13) {
				this.method7256();
			}
		}
		this.aClass5_Sub9_Sub2_2.method8198(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "(B)Lclient!et;")
	public final Class5_Sub9_Sub1 method7254() {
		return this.aClass5_Sub9_Sub1_2;
	}

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "(B)Z")
	public final boolean method7255() {
		if (this.aBoolean726 || this.aBoolean724) {
			return this.aClass5_Sub9_Sub1_2 == null || this.aClass5_Sub9_Sub1_2.method2743() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "(B)V")
	private void method7256() {
		for (@Pc(7) Class5_Sub9 local7 = (Class5_Sub9) this.aClass300_39.method7182(); local7 != null; local7 = (Class5_Sub9) this.aClass300_39.method7192()) {
			if (local7 instanceof Class5_Sub9_Sub4) {
				@Pc(23) Class5_Sub9_Sub4 local23 = (Class5_Sub9_Sub4) local7;
				while ((local23.anInt9828 <= 8 || this.method7250() > (double) local23.method8204()) && local23.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local23.method8198(this.anOggPacket2);
				}
			}
		}
		this.method7251(this.aString81);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "([BB)I")
	protected abstract int method7257(@OriginalArg(0) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(Z)Lclient!uh;")
	public final Class5_Sub9_Sub4 method7258() {
		return this.aClass5_Sub9_Sub4_2;
	}

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "(I)V")
	public final void method7260() {
		if (this.aBoolean726) {
			return;
		}
		for (@Pc(13) Class5_Sub9 local13 = (Class5_Sub9) this.aClass300_39.method7182(); local13 != null; local13 = (Class5_Sub9) this.aClass300_39.method7192()) {
			local13.method8195();
			local13.anOggStreamState5.b();
		}
		this.anOggPacket2.b();
		this.anOggPage2.b();
		this.anOggSyncState2.b();
		this.aBoolean726 = true;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IZ)V")
	public final void method7262(@OriginalArg(1) boolean arg0) {
		if (this.aClass5_Sub9_Sub1_2 != null) {
			@Pc(19) Class5_Sub17_Sub3 local19 = this.aClass5_Sub9_Sub1_2.method2739();
			if (local19 != null) {
				local19.method3992(arg0);
			}
		}
		this.aBoolean727 = !this.aBoolean727;
	}
}
