import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public abstract class Class103 {

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "Ljava/lang/String;")
	private String aString108;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Z")
	private boolean aBoolean572;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "Lclient!lb;")
	private Class5_Sub5_Sub3 aClass5_Sub5_Sub3_2;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "Z")
	private boolean aBoolean573;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "Z")
	private boolean aBoolean574;

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "Z")
	private boolean aBoolean575;

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "Lclient!ei;")
	private Class5_Sub5_Sub1 aClass5_Sub5_Sub1_2;

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "Lclient!sc;")
	private Class5_Sub5_Sub4 aClass5_Sub5_Sub4_2;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "[B")
	private final byte[] aByteArray53;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!fc", name = "E", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "Lclient!du;")
	private final Class81 aClass81_52;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I)V")
	protected Class103(@OriginalArg(0) int arg0) {
		if (!Static190.method673("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray53 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass81_52 = new Class81(8);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Z")
	public final boolean method6151() {
		if (this.aBoolean574 || this.aBoolean575) {
			return this.aClass5_Sub5_Sub4_2 == null || this.aClass5_Sub5_Sub4_2.method7388() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
	private void method6152() {
		for (@Pc(11) Class5_Sub5 local11 = (Class5_Sub5) this.aClass81_52.method1608(); local11 != null; local11 = (Class5_Sub5) this.aClass81_52.method1610()) {
			if (this.aClass5_Sub5_Sub1_2 != local11) {
				while (local11.anOggStreamState5.packetOut() == 1) {
					local11.method7380(this.anOggPacket2);
				}
			}
		}
		if (this.aClass5_Sub5_Sub1_2 == null) {
			return;
		}
		for (@Pc(45) int local45 = 0; local45 < 10 && this.method6161(); local45++) {
			if (this.aClass5_Sub5_Sub1_2.anOggStreamState5.packetOut() != 1) {
				this.method6158();
				return;
			}
			this.aClass5_Sub5_Sub1_2.method7380(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)Lclient!lb;")
	public final Class5_Sub5_Sub3 method6153() {
		return this.aClass5_Sub5_Sub3_2;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
	private void method6154() {
		for (@Pc(19) Class5_Sub5 local19 = (Class5_Sub5) this.aClass81_52.method1608(); local19 != null; local19 = (Class5_Sub5) this.aClass81_52.method1610()) {
			if (local19 instanceof Class5_Sub5_Sub3) {
				@Pc(27) Class5_Sub5_Sub3 local27 = (Class5_Sub5_Sub3) local19;
				while ((local27.anInt8564 <= 8 || this.method6165() > (double) local27.method4930()) && local27.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local27.method7380(this.anOggPacket2);
				}
			}
		}
		this.method6167(this.aString108);
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
	private void method6155() throws IOException {
		while (this.aClass5_Sub5_Sub1_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(17) Class5_Sub5 local17 = this.method6162();
			if (local17 == null) {
				if (this.aBoolean575) {
					this.method6152();
				}
				return;
			}
			if (this.aClass5_Sub5_Sub3_2 == local17) {
				this.method6154();
			}
		}
		this.aClass5_Sub5_Sub1_2.method7380(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V")
	public final void method6158() {
		if (this.aBoolean574) {
			return;
		}
		for (@Pc(15) Class5_Sub5 local15 = (Class5_Sub5) this.aClass81_52.method1608(); local15 != null; local15 = (Class5_Sub5) this.aClass81_52.method1610()) {
			local15.method7384();
			local15.anOggStreamState5.b();
		}
		this.anOggPacket2.b();
		this.anOggPage2.b();
		this.anOggSyncState2.b();
		this.aBoolean574 = true;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)Lclient!ei;")
	public final Class5_Sub5_Sub1 method6159() {
		return this.aClass5_Sub5_Sub1_2;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)V")
	public final void method6160(@OriginalArg(0) boolean arg0) {
		if (this.aClass5_Sub5_Sub4_2 != null) {
			@Pc(7) Class5_Sub16_Sub5 local7 = this.aClass5_Sub5_Sub4_2.method7389();
			if (local7 != null) {
				local7.method8291(arg0);
			}
		}
		this.aBoolean572 = !this.aBoolean572;
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)Z")
	private boolean method6161() {
		if (this.aClass5_Sub5_Sub4_2 == null) {
			@Pc(38) double local38 = (double) this.aClass5_Sub5_Sub1_2.method1901();
			return local38 == 0.0D || (double) Static205.method3179() >= 1000.0D / local38 + (double) this.aClass5_Sub5_Sub1_2.method1908();
		} else {
			return !this.aClass5_Sub5_Sub1_2.method1907() || this.method6165() > this.aClass5_Sub5_Sub1_2.method1902();
		}
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(B)Lclient!bc;")
	private Class5_Sub5 method6162() throws IOException {
		if (this.aBoolean574) {
			throw new IllegalStateException();
		} else if (this.aBoolean575) {
			return null;
		} else {
			@Pc(23) int local23;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local23 = this.method6163(this.aByteArray53);
				if (local23 == -1) {
					this.aBoolean575 = true;
					return null;
				}
				if (local23 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray53, local23)) {
					throw new RuntimeException("");
				}
			}
			local23 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(199) Class5_Sub5 local199 = (Class5_Sub5) this.aClass81_52.method1599((long) local23);
				if (!local199.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local199;
			}
			@Pc(78) OggStreamState local78 = new OggStreamState(local23);
			if (!local78.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local78.packetPeek(this.anOggPacket2) == 1) {
				@Pc(120) Class5_Sub5 local120;
				if (this.aClass5_Sub5_Sub1_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass5_Sub5_Sub1_2 = new Class5_Sub5_Sub1(local78);
					local120 = this.aClass5_Sub5_Sub1_2;
				} else if (this.aClass5_Sub5_Sub4_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass5_Sub5_Sub4_2 = new Class5_Sub5_Sub4(local78);
					local120 = this.aClass5_Sub5_Sub4_2;
				} else {
					@Pc(126) byte[] local126 = this.anOggPacket2.getData();
					@Pc(130) StringBuffer local130 = new StringBuffer();
					for (@Pc(132) int local132 = 1; local126.length > local132 && Character.isLetterOrDigit((char) local126[local132]); local132++) {
						local130.append((char) local126[local132]);
					}
					@Pc(155) String local155 = local130.toString();
					if (local155.equals("kate")) {
						local120 = new Class5_Sub5_Sub3(local78);
					} else {
						local120 = new Class5_Sub5_Sub2(local78);
					}
				}
				this.aClass81_52.method1607(local120, (long) local23);
				return local120;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([BI)I")
	protected abstract int method6163(@OriginalArg(0) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)Lclient!sc;")
	public final Class5_Sub5_Sub4 method6164() {
		return this.aClass5_Sub5_Sub4_2;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)D")
	public final double method6165() {
		if (this.aClass5_Sub5_Sub4_2 == null) {
			return this.aClass5_Sub5_Sub1_2 == null ? 0.0D : this.aClass5_Sub5_Sub1_2.method1902();
		} else {
			return this.aClass5_Sub5_Sub4_2.method7386();
		}
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(B)V")
	public final void method6166() throws IOException {
		if (this.aBoolean572) {
			return;
		}
		while (!this.aBoolean574) {
			@Pc(31) Class5_Sub5 local31;
			if (this.aBoolean573) {
				local31 = (Class5_Sub5) this.aClass81_52.method1599((long) this.anOggPage2.getSerialNumber());
			} else {
				local31 = this.method6162();
				if (local31 == null) {
					if (this.aBoolean575) {
						this.method6152();
					}
					return;
				}
				if (local31 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean573 = true;
			}
			if (local31 == this.aClass5_Sub5_Sub4_2) {
				if (this.aClass5_Sub5_Sub4_2.method7388() >= 50) {
					return;
				}
				while (this.aClass5_Sub5_Sub4_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass5_Sub5_Sub4_2.method7380(this.anOggPacket2);
					this.method6154();
					if (this.aClass5_Sub5_Sub1_2 != null) {
						@Pc(85) double local85 = this.aClass5_Sub5_Sub1_2.method1902();
						for (@Pc(87) int local87 = 0; local87 < 10 && this.method6161(); local87++) {
							this.method6155();
							if (this.aBoolean574) {
								return;
							}
						}
						if (this.aClass5_Sub5_Sub1_2.method1902() > local85) {
							return;
						}
					}
					if (this.aClass5_Sub5_Sub4_2.method7388() >= 50) {
						return;
					}
				}
			} else if (local31 instanceof Class5_Sub5_Sub3) {
				this.method6154();
			} else if (this.aClass5_Sub5_Sub1_2 != local31) {
				while (local31.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local31.anInt8564 == 1 && local31 instanceof Class5_Sub5_Sub3) {
						this.method6167(this.aString108);
					}
					local31.method7380(this.anOggPacket2);
				}
			} else if (this.aClass5_Sub5_Sub4_2 == null && !this.aBoolean572) {
				for (@Pc(148) int local148 = 0; local148 < 10 && this.method6161(); local148++) {
					this.method6155();
					if (this.aBoolean574) {
						return;
					}
				}
				return;
			}
			this.aBoolean573 = false;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method6167(@OriginalArg(1) String arg0) {
		this.aString108 = arg0;
		if (this.aString108 == null) {
			this.aClass5_Sub5_Sub3_2 = null;
			return;
		}
		if (this.aClass5_Sub5_Sub3_2 != null && !this.aString108.equals(this.aClass5_Sub5_Sub3_2.method4933())) {
			this.aClass5_Sub5_Sub3_2 = null;
		}
		if (this.aClass5_Sub5_Sub3_2 != null) {
			return;
		}
		for (@Pc(54) Class5_Sub5 local54 = (Class5_Sub5) this.aClass81_52.method1608(); local54 != null; local54 = (Class5_Sub5) this.aClass81_52.method1610()) {
			if (local54 instanceof Class5_Sub5_Sub3) {
				@Pc(62) Class5_Sub5_Sub3 local62 = (Class5_Sub5_Sub3) local54;
				if (this.aString108.equals(local62.method4933())) {
					this.aClass5_Sub5_Sub3_2 = local62;
					return;
				}
			}
		}
	}
}
