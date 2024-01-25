import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class264 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "[I")
	private int[] anIntArray612;

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "Ljava/lang/String;")
	private String aString65;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "[I")
	private int[] anIntArray613;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray48;

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "Lclient!mn;")
	private Class163 aClass163_42;

	@OriginalMember(owner = "client!wi", name = "i", descriptor = "Ljava/lang/String;")
	private String aString66;

	@OriginalMember(owner = "client!wi", name = "k", descriptor = "[I")
	private int[] anIntArray614;

	@OriginalMember(owner = "client!wi", name = "l", descriptor = "[I")
	private int[] anIntArray615;

	@OriginalMember(owner = "client!wi", name = "m", descriptor = "[I")
	private int[] anIntArray616;

	@OriginalMember(owner = "client!wi", name = "n", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray49;

	@OriginalMember(owner = "client!wi", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!wi", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray63;

	@OriginalMember(owner = "client!wi", name = "q", descriptor = "[I")
	private int[] anIntArray617;

	@OriginalMember(owner = "client!wi", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray64;

	@OriginalMember(owner = "client!wi", name = "t", descriptor = "[I")
	private int[] anIntArray618;

	@OriginalMember(owner = "client!wi", name = "u", descriptor = "[I")
	private int[] anIntArray619;

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
	public int anInt7225 = -1;

	static {
		new Class209(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!si;)V")
	public void method5708(@OriginalArg(1) Class2_Sub23 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5495();
			if (local14 == 0) {
				return;
			}
			this.method5710(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
	public void method5709() {
		if (this.aString66 == null) {
			this.aString66 = this.aString65;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!si;II)V")
	private void method5710(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString65 = arg0.method5467();
		} else if (arg1 == 2) {
			this.aString66 = arg0.method5467();
		} else {
			@Pc(33) int local33;
			@Pc(40) int local40;
			if (arg1 == 3) {
				local33 = arg0.method5495();
				this.anIntArrayArray64 = new int[local33][3];
				for (local40 = 0; local40 < local33; local40++) {
					this.anIntArrayArray64[local40][0] = arg0.method5500();
					this.anIntArrayArray64[local40][1] = arg0.method5508();
					this.anIntArrayArray64[local40][2] = arg0.method5508();
				}
			} else if (arg1 == 4) {
				local33 = arg0.method5495();
				this.anIntArrayArray63 = new int[local33][3];
				for (local40 = 0; local40 < local33; local40++) {
					this.anIntArrayArray63[local40][0] = arg0.method5500();
					this.anIntArrayArray63[local40][1] = arg0.method5508();
					this.anIntArrayArray63[local40][2] = arg0.method5508();
				}
			} else if (arg1 == 5) {
				arg0.method5500();
			} else if (arg1 == 6) {
				arg0.method5495();
			} else if (arg1 == 7) {
				arg0.method5495();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method5495();
				} else if (arg1 == 10) {
					local33 = arg0.method5495();
					this.anIntArray613 = new int[local33];
					for (local40 = 0; local40 < local33; local40++) {
						this.anIntArray613[local40] = arg0.method5508();
					}
				} else if (arg1 == 12) {
					arg0.method5508();
				} else if (arg1 == 13) {
					local33 = arg0.method5495();
					this.anIntArray616 = new int[local33];
					for (local40 = 0; local40 < local33; local40++) {
						this.anIntArray616[local40] = arg0.method5500();
					}
				} else if (arg1 == 14) {
					local33 = arg0.method5495();
					this.anIntArrayArray62 = new int[local33][2];
					for (local40 = 0; local40 < local33; local40++) {
						this.anIntArrayArray62[local40][0] = arg0.method5495();
						this.anIntArrayArray62[local40][1] = arg0.method5495();
					}
				} else if (arg1 == 15) {
					arg0.method5500();
				} else if (arg1 == 17) {
					this.anInt7225 = arg0.method5500();
				} else if (arg1 == 18) {
					local33 = arg0.method5495();
					this.aStringArray49 = new String[local33];
					this.anIntArray612 = new int[local33];
					this.anIntArray618 = new int[local33];
					this.anIntArray614 = new int[local33];
					for (local40 = 0; local40 < local33; local40++) {
						this.anIntArray614[local40] = arg0.method5508();
						this.anIntArray618[local40] = arg0.method5508();
						this.anIntArray612[local40] = arg0.method5508();
						this.aStringArray49[local40] = arg0.method5494();
					}
				} else if (arg1 == 19) {
					local33 = arg0.method5495();
					this.anIntArray617 = new int[local33];
					this.anIntArray619 = new int[local33];
					this.anIntArray615 = new int[local33];
					this.aStringArray48 = new String[local33];
					for (local40 = 0; local40 < local33; local40++) {
						this.anIntArray617[local40] = arg0.method5508();
						this.anIntArray615[local40] = arg0.method5508();
						this.anIntArray619[local40] = arg0.method5508();
						this.aStringArray48[local40] = arg0.method5494();
					}
				} else if (arg1 == 249) {
					local33 = arg0.method5495();
					if (this.aClass163_42 == null) {
						local40 = Static51.method863(local33);
						this.aClass163_42 = new Class163(local40);
					}
					for (local40 = 0; local40 < local33; local40++) {
						@Pc(226) boolean local226 = arg0.method5495() == 1;
						@Pc(230) int local230 = arg0.method5485();
						@Pc(239) Class2 local239;
						if (local226) {
							local239 = new Class2_Sub4(arg0.method5494());
						} else {
							local239 = new Class2_Sub26(arg0.method5508());
						}
						this.aClass163_42.method3764((long) local230, local239);
					}
				}
			}
		}
	}
}
