import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class231 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "[I")
	private int[] anIntArray315;

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray40;

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "[I")
	private int[] anIntArray316;

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "Ljava/lang/String;")
	private String aString59;

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "[I")
	private int[] anIntArray317;

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "[I")
	private int[] anIntArray318;

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "Lclient!pl;")
	private Class273 aClass273_18;

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "[I")
	private int[] anIntArray319;

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "Ljava/lang/String;")
	private String aString60;

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "[I")
	private int[] anIntArray320;

	@OriginalMember(owner = "client!mh", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!mh", name = "q", descriptor = "[I")
	private int[] anIntArray321;

	@OriginalMember(owner = "client!mh", name = "s", descriptor = "[I")
	private int[] anIntArray322;

	@OriginalMember(owner = "client!mh", name = "t", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray41;

	@OriginalMember(owner = "client!mh", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
	public int anInt5770 = -1;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLclient!ofa;)V")
	public void method5121(@OriginalArg(1) Class5_Sub22 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5966();
			if (local17 == 0) {
				return;
			}
			this.method5125(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
	public void method5122() {
		if (this.aString59 == null) {
			this.aString59 = this.aString60;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ofa;BI)V")
	private void method5125(@OriginalArg(0) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString60 = arg0.method5923();
		} else if (arg1 == 2) {
			this.aString59 = arg0.method5923();
		} else {
			@Pc(16) int local16;
			@Pc(23) int local23;
			if (arg1 == 3) {
				local16 = arg0.method5966();
				this.anIntArrayArray42 = new int[local16][3];
				for (local23 = 0; local23 < local16; local23++) {
					this.anIntArrayArray42[local23][0] = arg0.method5968();
					this.anIntArrayArray42[local23][1] = arg0.method5913();
					this.anIntArrayArray42[local23][2] = arg0.method5913();
				}
			} else if (arg1 == 4) {
				local16 = arg0.method5966();
				this.anIntArrayArray41 = new int[local16][3];
				for (local23 = 0; local23 < local16; local23++) {
					this.anIntArrayArray41[local23][0] = arg0.method5968();
					this.anIntArrayArray41[local23][1] = arg0.method5913();
					this.anIntArrayArray41[local23][2] = arg0.method5913();
				}
			} else if (arg1 == 5) {
				arg0.method5968();
			} else if (arg1 == 6) {
				arg0.method5966();
			} else if (arg1 == 7) {
				arg0.method5966();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method5966();
				} else if (arg1 == 10) {
					local16 = arg0.method5966();
					this.anIntArray318 = new int[local16];
					for (local23 = 0; local23 < local16; local23++) {
						this.anIntArray318[local23] = arg0.method5913();
					}
				} else if (arg1 == 12) {
					arg0.method5913();
				} else if (arg1 == 13) {
					local16 = arg0.method5966();
					this.anIntArray321 = new int[local16];
					for (local23 = 0; local23 < local16; local23++) {
						this.anIntArray321[local23] = arg0.method5968();
					}
				} else if (arg1 == 14) {
					local16 = arg0.method5966();
					this.anIntArrayArray40 = new int[local16][2];
					for (local23 = 0; local23 < local16; local23++) {
						this.anIntArrayArray40[local23][0] = arg0.method5966();
						this.anIntArrayArray40[local23][1] = arg0.method5966();
					}
				} else if (arg1 == 15) {
					arg0.method5968();
				} else if (arg1 == 17) {
					this.anInt5770 = arg0.method5968();
				} else if (arg1 == 18) {
					local16 = arg0.method5966();
					this.anIntArray320 = new int[local16];
					this.anIntArray319 = new int[local16];
					this.aStringArray40 = new String[local16];
					this.anIntArray316 = new int[local16];
					for (local23 = 0; local23 < local16; local23++) {
						this.anIntArray320[local23] = arg0.method5913();
						this.anIntArray319[local23] = arg0.method5913();
						this.anIntArray316[local23] = arg0.method5913();
						this.aStringArray40[local23] = arg0.method5937();
					}
				} else if (arg1 == 19) {
					local16 = arg0.method5966();
					this.aStringArray41 = new String[local16];
					this.anIntArray322 = new int[local16];
					this.anIntArray315 = new int[local16];
					this.anIntArray317 = new int[local16];
					for (local23 = 0; local23 < local16; local23++) {
						this.anIntArray315[local23] = arg0.method5913();
						this.anIntArray317[local23] = arg0.method5913();
						this.anIntArray322[local23] = arg0.method5913();
						this.aStringArray41[local23] = arg0.method5937();
					}
				} else if (arg1 == 249) {
					local16 = arg0.method5966();
					if (this.aClass273_18 == null) {
						local23 = Static613.method8740(local16);
						this.aClass273_18 = new Class273(local23);
					}
					for (local23 = 0; local23 < local16; local23++) {
						@Pc(318) boolean local318 = arg0.method5966() == 1;
						@Pc(322) int local322 = arg0.method5931();
						@Pc(331) Class5 local331;
						if (local318) {
							local331 = new Class5_Sub7(arg0.method5937());
						} else {
							local331 = new Class5_Sub41(arg0.method5913());
						}
						this.aClass273_18.method6585((long) local322, local331);
					}
				}
			}
		}
	}
}
