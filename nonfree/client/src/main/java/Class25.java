import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class25 {

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "[I")
	public int[] anIntArray33;

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "[I")
	public int[] anIntArray34;

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "[I")
	public int[] anIntArray35;

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "[[I")
	public int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
	public int anInt620;

	@OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
	public int anInt621;

	@OriginalMember(owner = "client!bm", name = "j", descriptor = "[I")
	public int[] anIntArray36;

	@OriginalMember(owner = "client!bm", name = "k", descriptor = "[I")
	public int[] anIntArray37;

	@OriginalMember(owner = "client!bm", name = "l", descriptor = "[Lclient!fb;")
	public Class75[] aClass75Array1;

	@OriginalMember(owner = "client!bm", name = "n", descriptor = "Lclient!fb;")
	public Class75 aClass75_1;

	@OriginalMember(owner = "client!bm", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
	public int anInt623;

	@OriginalMember(owner = "client!bm", name = "r", descriptor = "[I")
	public int[] anIntArray38;

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
	public final int anInt619;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "([BI)V")
	public Class25(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt619 = Static182.method2410(arg0.length, arg0);
		if (arg1 != this.anInt619) {
			throw new RuntimeException();
		}
		this.method545(arg0);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "([BI)V")
	private void method545(@OriginalArg(0) byte[] arg0) {
		@Pc(14) Class1_Sub11 local14 = new Class1_Sub11(Static130.method1780(arg0));
		@Pc(18) int local18 = local14.method4463();
		if (local18 != 5 && local18 != 6) {
			throw new RuntimeException();
		}
		if (local18 >= 6) {
			this.anInt621 = local14.method4487();
		} else {
			this.anInt621 = 0;
		}
		@Pc(45) int local45 = local14.method4463();
		this.anInt620 = local14.method4485();
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = -1;
		this.anIntArray36 = new int[this.anInt620];
		for (@Pc(61) int local61 = 0; local61 < this.anInt620; local61++) {
			this.anIntArray36[local61] = local52 += local14.method4485();
			if (local54 < this.anIntArray36[local61]) {
				local54 = this.anIntArray36[local61];
			}
		}
		this.anInt623 = local54 + 1;
		this.anIntArrayArray15 = new int[this.anInt623][];
		this.anIntArray35 = new int[this.anInt623];
		this.anIntArray37 = new int[this.anInt623];
		this.anIntArray33 = new int[this.anInt623];
		this.anIntArray34 = new int[this.anInt623];
		@Pc(136) int local136;
		@Pc(154) int local154;
		if (local45 != 0) {
			this.anIntArray38 = new int[this.anInt623];
			for (local136 = 0; local136 < this.anInt623; local136++) {
				this.anIntArray38[local136] = -1;
			}
			for (local154 = 0; local154 < this.anInt620; local154++) {
				this.anIntArray38[this.anIntArray36[local154]] = local14.method4487();
			}
			this.aClass75_1 = new Class75(this.anIntArray38);
		}
		for (local136 = 0; local136 < this.anInt620; local136++) {
			this.anIntArray35[this.anIntArray36[local136]] = local14.method4487();
		}
		for (local154 = 0; local154 < this.anInt620; local154++) {
			this.anIntArray33[this.anIntArray36[local154]] = local14.method4487();
		}
		for (@Pc(222) int local222 = 0; local222 < this.anInt620; local222++) {
			this.anIntArray37[this.anIntArray36[local222]] = local14.method4485();
		}
		@Pc(252) int local252;
		@Pc(257) int local257;
		@Pc(261) int local261;
		@Pc(269) int local269;
		@Pc(286) int local286;
		for (@Pc(245) int local245 = 0; local245 < this.anInt620; local245++) {
			local252 = this.anIntArray36[local245];
			local257 = this.anIntArray37[local252];
			local52 = 0;
			local261 = -1;
			this.anIntArrayArray15[local252] = new int[local257];
			for (local269 = 0; local269 < local257; local269++) {
				local286 = this.anIntArrayArray15[local252][local269] = local52 += local14.method4485();
				if (local261 < local286) {
					local261 = local286;
				}
			}
			this.anIntArray34[local252] = local261 + 1;
			if (local261 + 1 == local257) {
				this.anIntArrayArray15[local252] = null;
			}
		}
		if (local45 == 0) {
			return;
		}
		this.anIntArrayArray14 = new int[local54 + 1][];
		this.aClass75Array1 = new Class75[local54 + 1];
		for (local252 = 0; local252 < this.anInt620; local252++) {
			local257 = this.anIntArray36[local252];
			local261 = this.anIntArray37[local257];
			this.anIntArrayArray14[local257] = new int[this.anIntArray34[local257]];
			for (local269 = 0; local269 < this.anIntArray34[local257]; local269++) {
				this.anIntArrayArray14[local257][local269] = -1;
			}
			for (local286 = 0; local286 < local261; local286++) {
				@Pc(400) int local400;
				if (this.anIntArrayArray15[local257] == null) {
					local400 = local286;
				} else {
					local400 = this.anIntArrayArray15[local257][local286];
				}
				this.anIntArrayArray14[local257][local400] = local14.method4487();
			}
			this.aClass75Array1[local257] = new Class75(this.anIntArrayArray14[local257]);
		}
	}
}
