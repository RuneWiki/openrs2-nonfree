import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class131 {

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "[I")
	public int[] anIntArray292;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "[I")
	public int[] anIntArray293;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
	public int anInt3880;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "Lclient!hk;")
	public Class82 aClass82_1;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "[I")
	public int[] anIntArray294;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "[Lclient!hk;")
	public Class82[] aClass82Array1;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
	public int anInt3881;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "[I")
	public int[] anIntArray295;

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "[[I")
	public int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "[I")
	public int[] anIntArray296;

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "[I")
	public int[] anIntArray297;

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
	public int anInt3887;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
	public final int anInt3879;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([BI)V")
	public Class131(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3879 = Static37.method929(arg0.length, arg0);
		if (arg1 != this.anInt3879) {
			throw new RuntimeException();
		}
		this.method3623(arg0);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([BB)V")
	private void method3623(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class1_Sub7 local12 = new Class1_Sub7(Static87.method1815(arg0));
		@Pc(16) int local16 = local12.method2132();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt3880 = local12.method2140();
		} else {
			this.anInt3880 = 0;
		}
		@Pc(45) int local45 = local12.method2132();
		this.anInt3887 = local12.method2161();
		@Pc(52) int local52 = 0;
		this.anIntArray292 = new int[this.anInt3887];
		@Pc(59) int local59 = -1;
		for (@Pc(61) int local61 = 0; local61 < this.anInt3887; local61++) {
			this.anIntArray292[local61] = local52 += local12.method2161();
			if (local59 < this.anIntArray292[local61]) {
				local59 = this.anIntArray292[local61];
			}
		}
		this.anInt3881 = local59 + 1;
		this.anIntArray293 = new int[this.anInt3881];
		this.anIntArray296 = new int[this.anInt3881];
		this.anIntArray295 = new int[this.anInt3881];
		this.anIntArrayArray32 = new int[this.anInt3881][];
		this.anIntArray294 = new int[this.anInt3881];
		@Pc(136) int local136;
		@Pc(150) int local150;
		if (local45 != 0) {
			this.anIntArray297 = new int[this.anInt3881];
			for (local136 = 0; local136 < this.anInt3881; local136++) {
				this.anIntArray297[local136] = -1;
			}
			for (local150 = 0; local150 < this.anInt3887; local150++) {
				this.anIntArray297[this.anIntArray292[local150]] = local12.method2140();
			}
			this.aClass82_1 = new Class82(this.anIntArray297);
		}
		for (local136 = 0; local136 < this.anInt3887; local136++) {
			this.anIntArray295[this.anIntArray292[local136]] = local12.method2140();
		}
		for (local150 = 0; local150 < this.anInt3887; local150++) {
			this.anIntArray293[this.anIntArray292[local150]] = local12.method2140();
		}
		for (@Pc(222) int local222 = 0; local222 < this.anInt3887; local222++) {
			this.anIntArray296[this.anIntArray292[local222]] = local12.method2161();
		}
		@Pc(252) int local252;
		@Pc(257) int local257;
		@Pc(267) int local267;
		@Pc(269) int local269;
		@Pc(286) int local286;
		for (@Pc(245) int local245 = 0; local245 < this.anInt3887; local245++) {
			local252 = this.anIntArray292[local245];
			local257 = this.anIntArray296[local252];
			local52 = 0;
			this.anIntArrayArray32[local252] = new int[local257];
			local267 = -1;
			for (local269 = 0; local269 < local257; local269++) {
				local286 = this.anIntArrayArray32[local252][local269] = local52 += local12.method2161();
				if (local267 < local286) {
					local267 = local286;
				}
			}
			this.anIntArray294[local252] = local267 + 1;
			if (local257 == local267 + 1) {
				this.anIntArrayArray32[local252] = null;
			}
		}
		if (local45 == 0) {
			return;
		}
		this.aClass82Array1 = new Class82[local59 + 1];
		this.anIntArrayArray33 = new int[local59 + 1][];
		for (local252 = 0; local252 < this.anInt3887; local252++) {
			local257 = this.anIntArray292[local252];
			local267 = this.anIntArray296[local257];
			this.anIntArrayArray33[local257] = new int[this.anIntArray294[local257]];
			for (local269 = 0; local269 < this.anIntArray294[local257]; local269++) {
				this.anIntArrayArray33[local257][local269] = -1;
			}
			for (local286 = 0; local286 < local267; local286++) {
				@Pc(400) int local400;
				if (this.anIntArrayArray32[local257] == null) {
					local400 = local286;
				} else {
					local400 = this.anIntArrayArray32[local257][local286];
				}
				this.anIntArrayArray33[local257][local400] = local12.method2140();
			}
			this.aClass82Array1[local257] = new Class82(this.anIntArrayArray33[local257]);
		}
	}
}
