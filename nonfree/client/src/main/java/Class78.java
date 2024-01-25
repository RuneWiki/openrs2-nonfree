import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kha")
public abstract class Class78 {

	@OriginalMember(owner = "client!kha", name = "i", descriptor = "Z")
	private boolean aBoolean139;

	@OriginalMember(owner = "client!kha", name = "k", descriptor = "Lclient!bka;")
	private Class2_Sub7_Sub2 aClass2_Sub7_Sub2_2;

	@OriginalMember(owner = "client!kha", name = "m", descriptor = "Lclient!qa;")
	private Class2_Sub7_Sub4 aClass2_Sub7_Sub4_2;

	@OriginalMember(owner = "client!kha", name = "n", descriptor = "Z")
	private boolean aBoolean140;

	@OriginalMember(owner = "client!kha", name = "o", descriptor = "Z")
	private boolean aBoolean141;

	@OriginalMember(owner = "client!kha", name = "p", descriptor = "Lclient!ik;")
	private Class2_Sub7_Sub3 aClass2_Sub7_Sub3_2;

	@OriginalMember(owner = "client!kha", name = "s", descriptor = "Z")
	private boolean aBoolean142;

	@OriginalMember(owner = "client!kha", name = "B", descriptor = "Ljava/lang/String;")
	private String aString24;

	@OriginalMember(owner = "client!kha", name = "e", descriptor = "[B")
	private final byte[] aByteArray22;

	@OriginalMember(owner = "client!kha", name = "c", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!kha", name = "t", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!kha", name = "d", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!kha", name = "b", descriptor = "Lclient!si;")
	private final Class335 aClass335_8;

	@OriginalMember(owner = "client!kha", name = "<init>", descriptor = "(I)V")
	protected Class78(@OriginalArg(0) int arg0) {
		if (!Static91.method1580("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray22 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass335_8 = new Class335(8);
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(I)Z")
	public final boolean method1993() {
		if (this.aBoolean142 || this.aBoolean139) {
			return this.aClass2_Sub7_Sub3_2 == null || this.aClass2_Sub7_Sub3_2.method4460() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "([BB)I")
	protected abstract int method1994(@OriginalArg(0) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(BZ)V")
	public final void method1995(@OriginalArg(1) boolean arg0) {
		if (this.aClass2_Sub7_Sub3_2 != null) {
			@Pc(11) Class2_Sub26_Sub2 local11 = this.aClass2_Sub7_Sub3_2.method4464();
			if (local11 != null) {
				local11.method3392(arg0);
			}
		}
		this.aBoolean141 = !this.aBoolean141;
	}

	@OriginalMember(owner = "client!kha", name = "b", descriptor = "(I)Z")
	private boolean method1997() {
		if (this.aClass2_Sub7_Sub3_2 == null) {
			@Pc(18) double local18 = (double) this.aClass2_Sub7_Sub4_2.method7547();
			return local18 == 0.0D || (double) Static99.method1701() >= 1000.0D / local18 + (double) this.aClass2_Sub7_Sub4_2.method7546();
		} else {
			return !this.aClass2_Sub7_Sub4_2.method7542() || this.method2001() > this.aClass2_Sub7_Sub4_2.method7545();
		}
	}

	@OriginalMember(owner = "client!kha", name = "c", descriptor = "(I)V")
	private void method1998() throws IOException {
		while (this.aClass2_Sub7_Sub4_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(18) Class2_Sub7 local18 = this.method2002();
			if (local18 == null) {
				if (this.aBoolean139) {
					this.method2003();
				}
				return;
			}
			if (local18 == this.aClass2_Sub7_Sub2_2) {
				this.method2006();
			}
		}
		this.aClass2_Sub7_Sub4_2.method7540(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!kha", name = "d", descriptor = "(I)V")
	public final void method1999() {
		if (this.aBoolean142) {
			return;
		}
		for (@Pc(22) Class2_Sub7 local22 = (Class2_Sub7) this.aClass335_8.method8358(); local22 != null; local22 = (Class2_Sub7) this.aClass335_8.method8355()) {
			local22.method7539();
			local22.anOggStreamState5.a();
		}
		this.anOggPacket2.a();
		this.anOggPage2.a();
		this.anOggSyncState2.a();
		this.aBoolean142 = true;
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method2000(@OriginalArg(0) String arg0) {
		this.aString24 = arg0;
		if (this.aString24 == null) {
			this.aClass2_Sub7_Sub2_2 = null;
			return;
		}
		if (this.aClass2_Sub7_Sub2_2 != null && !this.aString24.equals(this.aClass2_Sub7_Sub2_2.method1057())) {
			this.aClass2_Sub7_Sub2_2 = null;
		}
		if (this.aClass2_Sub7_Sub2_2 != null) {
			return;
		}
		for (@Pc(38) Class2_Sub7 local38 = (Class2_Sub7) this.aClass335_8.method8358(); local38 != null; local38 = (Class2_Sub7) this.aClass335_8.method8355()) {
			if (local38 instanceof Class2_Sub7_Sub2) {
				@Pc(46) Class2_Sub7_Sub2 local46 = (Class2_Sub7_Sub2) local38;
				if (this.aString24.equals(local46.method1057())) {
					this.aClass2_Sub7_Sub2_2 = local46;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kha", name = "b", descriptor = "(B)D")
	public final double method2001() {
		if (this.aClass2_Sub7_Sub3_2 == null) {
			return this.aClass2_Sub7_Sub4_2 == null ? 0.0D : this.aClass2_Sub7_Sub4_2.method7545();
		} else {
			return this.aClass2_Sub7_Sub3_2.method4462();
		}
	}

	@OriginalMember(owner = "client!kha", name = "c", descriptor = "(B)Lclient!ni;")
	private Class2_Sub7 method2002() throws IOException {
		if (this.aBoolean142) {
			throw new IllegalStateException();
		} else if (this.aBoolean139) {
			return null;
		} else {
			@Pc(30) int local30;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local30 = this.method1994(this.aByteArray22);
				if (local30 == -1) {
					this.aBoolean139 = true;
					return null;
				}
				if (local30 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray22, local30)) {
					throw new RuntimeException("");
				}
			}
			local30 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(80) Class2_Sub7 local80 = (Class2_Sub7) this.aClass335_8.method8357((long) local30);
				if (!local80.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local80;
			}
			@Pc(97) OggStreamState local97 = new OggStreamState(local30);
			if (!local97.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local97.packetPeek(this.anOggPacket2) == 1) {
				@Pc(174) Class2_Sub7 local174;
				if (this.aClass2_Sub7_Sub4_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass2_Sub7_Sub4_2 = new Class2_Sub7_Sub4(local97);
					local174 = this.aClass2_Sub7_Sub4_2;
				} else if (this.aClass2_Sub7_Sub3_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass2_Sub7_Sub3_2 = new Class2_Sub7_Sub3(local97);
					local174 = this.aClass2_Sub7_Sub3_2;
				} else {
					@Pc(136) byte[] local136 = this.anOggPacket2.getData();
					@Pc(140) StringBuffer local140 = new StringBuffer();
					for (@Pc(142) int local142 = 1; local136.length > local142 && Character.isLetterOrDigit((char) local136[local142]); local142++) {
						local140.append((char) local136[local142]);
					}
					@Pc(165) String local165 = local140.toString();
					if (local165.equals("kate")) {
						local174 = new Class2_Sub7_Sub2(local97);
					} else {
						local174 = new Class2_Sub7_Sub1(local97);
					}
				}
				this.aClass335_8.method8356(local174, (long) local30);
				return local174;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!kha", name = "e", descriptor = "(I)V")
	private void method2003() {
		for (@Pc(11) Class2_Sub7 local11 = (Class2_Sub7) this.aClass335_8.method8358(); local11 != null; local11 = (Class2_Sub7) this.aClass335_8.method8355()) {
			if (this.aClass2_Sub7_Sub4_2 != local11) {
				while (local11.anOggStreamState5.packetOut() == 1) {
					local11.method7540(this.anOggPacket2);
				}
			}
		}
		if (this.aClass2_Sub7_Sub4_2 == null) {
			return;
		}
		for (@Pc(50) int local50 = 0; local50 < 10; local50++) {
			if (!this.method1997()) {
				return;
			}
			if (this.aClass2_Sub7_Sub4_2.anOggStreamState5.packetOut() != 1) {
				this.method1999();
				return;
			}
			this.aClass2_Sub7_Sub4_2.method7540(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(Z)Lclient!ik;")
	public final Class2_Sub7_Sub3 method2004() {
		return this.aClass2_Sub7_Sub3_2;
	}

	@OriginalMember(owner = "client!kha", name = "d", descriptor = "(B)Lclient!bka;")
	public final Class2_Sub7_Sub2 method2005() {
		return this.aClass2_Sub7_Sub2_2;
	}

	@OriginalMember(owner = "client!kha", name = "f", descriptor = "(I)V")
	private void method2006() {
		for (@Pc(7) Class2_Sub7 local7 = (Class2_Sub7) this.aClass335_8.method8358(); local7 != null; local7 = (Class2_Sub7) this.aClass335_8.method8355()) {
			if (local7 instanceof Class2_Sub7_Sub2) {
				@Pc(15) Class2_Sub7_Sub2 local15 = (Class2_Sub7_Sub2) local7;
				while ((local15.anInt8453 <= 8 || this.method2001() > (double) local15.method1054()) && local15.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local15.method7540(this.anOggPacket2);
				}
			}
		}
		this.method2000(this.aString24);
	}

	@OriginalMember(owner = "client!kha", name = "g", descriptor = "(I)V")
	public final void method2007() throws IOException {
		if (this.aBoolean141) {
			return;
		}
		while (!this.aBoolean142) {
			@Pc(22) Class2_Sub7 local22;
			if (this.aBoolean140) {
				local22 = (Class2_Sub7) this.aClass335_8.method8357((long) this.anOggPage2.getSerialNumber());
			} else {
				local22 = this.method2002();
				if (local22 == null) {
					if (this.aBoolean139) {
						this.method2003();
					}
					return;
				}
				if (local22 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean140 = true;
			}
			if (local22 == this.aClass2_Sub7_Sub3_2) {
				if (this.aClass2_Sub7_Sub3_2.method4460() >= 50) {
					return;
				}
				while (this.aClass2_Sub7_Sub3_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass2_Sub7_Sub3_2.method7540(this.anOggPacket2);
					this.method2006();
					if (this.aClass2_Sub7_Sub4_2 != null) {
						@Pc(76) double local76 = this.aClass2_Sub7_Sub4_2.method7545();
						for (@Pc(78) int local78 = 0; local78 < 10 && this.method1997(); local78++) {
							this.method1998();
							if (this.aBoolean142) {
								return;
							}
						}
						if (local76 < this.aClass2_Sub7_Sub4_2.method7545()) {
							return;
						}
					}
					if (this.aClass2_Sub7_Sub3_2.method4460() >= 50) {
						return;
					}
				}
			} else if (local22 instanceof Class2_Sub7_Sub2) {
				this.method2006();
			} else if (this.aClass2_Sub7_Sub4_2 != local22) {
				while (local22.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local22.anInt8453 == 1 && local22 instanceof Class2_Sub7_Sub2) {
						this.method2000(this.aString24);
					}
					local22.method7540(this.anOggPacket2);
				}
			} else if (this.aClass2_Sub7_Sub3_2 == null && !this.aBoolean141) {
				for (@Pc(176) int local176 = 0; local176 < 10 && this.method1997(); local176++) {
					this.method1998();
					if (this.aBoolean142) {
						return;
					}
				}
				return;
			}
			this.aBoolean140 = false;
		}
	}

	@OriginalMember(owner = "client!kha", name = "h", descriptor = "(I)Lclient!qa;")
	public final Class2_Sub7_Sub4 method2008() {
		return this.aClass2_Sub7_Sub4_2;
	}
}
