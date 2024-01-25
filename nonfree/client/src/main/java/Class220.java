import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class220 {

	@OriginalMember(owner = "client!mw", name = "h", descriptor = "I")
	private int anInt6015 = 0;

	@OriginalMember(owner = "client!mw", name = "e", descriptor = "I")
	private int anInt6014 = 0;

	@OriginalMember(owner = "client!mw", name = "m", descriptor = "I")
	private int anInt6018 = 0;

	@OriginalMember(owner = "client!mw", name = "o", descriptor = "Lclient!um;")
	private Class34 aClass34_1 = null;

	@OriginalMember(owner = "client!mw", name = "f", descriptor = "Lclient!us;")
	private final Class43_Sub3 aClass43_Sub3_24;

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "Lclient!vb;")
	private final Class343 aClass343_3;

	@OriginalMember(owner = "client!mw", name = "l", descriptor = "[Lclient!jg;")
	private final Class60[] aClass60Array1;

	@OriginalMember(owner = "client!mw", name = "g", descriptor = "Lclient!nh;")
	public final Class60_Sub4 aClass60_Sub4_1;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lclient!us;)V")
	public Class220(@OriginalArg(0) Class43_Sub3 arg0) {
		this.aClass43_Sub3_24 = arg0;
		this.aClass343_3 = new Class343(arg0);
		this.aClass60Array1 = new Class60[10];
		this.aClass60Array1[1] = new Class60_Sub8(arg0);
		this.aClass60Array1[2] = new Class60_Sub6(arg0, this.aClass343_3);
		this.aClass60Array1[4] = new Class60_Sub5(arg0, this.aClass343_3);
		this.aClass60Array1[5] = new Class60_Sub2(arg0, this.aClass343_3);
		this.aClass60Array1[6] = new Class60_Sub7(arg0);
		this.aClass60Array1[7] = new Class60_Sub3(arg0);
		this.aClass60Array1[3] = this.aClass60_Sub4_1 = new Class60_Sub4(arg0);
		this.aClass60Array1[8] = new Class60_Sub9(arg0, this.aClass343_3);
		this.aClass60Array1[9] = new Class60_Sub1(arg0, this.aClass343_3);
		if (!this.aClass60Array1[8].method7735()) {
			this.aClass60Array1[8] = this.aClass60Array1[4];
		}
		if (!this.aClass60Array1[9].method7735()) {
			this.aClass60Array1[9] = this.aClass60Array1[8];
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IILclient!um;)Z")
	public boolean method5186(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1) {
		if (this.anInt6018 == 0) {
			return false;
		}
		if (arg1 != this.aClass34_1) {
			this.aClass60Array1[this.anInt6018 & Integer.MAX_VALUE].method7737(arg0, arg1);
			this.aClass34_1 = arg1;
		}
		return true;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIIZZI)V")
	public void method5187(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(17) boolean local17 = arg3 & this.aClass43_Sub3_24.method7217();
		if (!local17 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
			if (arg4 == 4) {
				arg1 = arg0;
			}
			arg4 = 2;
		}
		if (arg4 != 0 && arg2) {
			arg4 |= Integer.MIN_VALUE;
		}
		if (arg4 != this.anInt6018) {
			if (this.anInt6018 != 0) {
				this.aClass60Array1[Integer.MAX_VALUE & this.anInt6018].method7732();
			}
			if (arg4 != 0) {
				this.aClass60Array1[Integer.MAX_VALUE & arg4].method7730(arg2);
				this.aClass60Array1[arg4 & Integer.MAX_VALUE].method7733(arg2);
				this.aClass60Array1[arg4 & Integer.MAX_VALUE].method7729(arg1, arg0);
			}
			this.aClass34_1 = null;
			this.anInt6015 = arg0;
			this.anInt6014 = arg1;
			this.anInt6018 = arg4;
		} else if (this.anInt6018 != 0) {
			this.aClass60Array1[Integer.MAX_VALUE & this.anInt6018].method7733(arg2);
			if (this.anInt6015 != arg0 || this.anInt6014 != arg1) {
				this.aClass60Array1[this.anInt6018 & Integer.MAX_VALUE].method7729(arg1, arg0);
				this.anInt6015 = arg0;
				this.anInt6014 = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(II)Z")
	public boolean method5188() {
		return this.aClass60Array1[3].method7735();
	}
}
