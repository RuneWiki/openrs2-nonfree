import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class15 implements Interface1 {

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
	private int anInt584 = 50;

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
	private int anInt585 = 128;

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "Lclient!nh;")
	private final Class62 aClass62_5;

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "Lclient!nh;")
	private final Class62 aClass62_4;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "Lclient!oe;")
	private Class66 aClass66_9;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!nh;Lclient!nh;II)V")
	public Class15(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt584 = arg2;
		this.aClass62_5 = arg0;
		this.anInt585 = arg3;
		this.aClass62_4 = arg1;
		this.aClass66_9 = new Class66(this.anInt584);
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(II)Z")
	@Override
	public boolean method387(@OriginalArg(0) int arg0) {
		return this.method391(arg0).aBoolean162;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method385(@OriginalArg(0) int arg0) {
		@Pc(13) Class4_Sub11 local13 = new Class4_Sub11(this.aClass62_5.method2878(0, arg0));
		@Pc(24) Class4_Sub1_Sub18 local24 = new Class4_Sub1_Sub18(local13);
		return local24.method3003(this.anInt585, this, this.aClass62_4);
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method383(@OriginalArg(1) int arg0) {
		return this.method391(arg0).method3002(this, this.aClass62_4);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method382(@OriginalArg(1) int arg0) {
		return this.anInt585 == 64 || this.method391(arg0).anInt3904 == 64;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)V")
	public void method389(@OriginalArg(0) int arg0) {
		for (@Pc(7) Class4_Sub1_Sub18 local7 = (Class4_Sub1_Sub18) this.aClass66_9.method2221(); local7 != null; local7 = (Class4_Sub1_Sub18) this.aClass66_9.method2217()) {
			if (local7.aBoolean160) {
				local7.method3004(arg0);
				local7.aBoolean160 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "(II)Lclient!v;")
	private Class4_Sub1_Sub18 method391(@OriginalArg(1) int arg0) {
		@Pc(11) Class4_Sub1_Sub18 local11 = (Class4_Sub1_Sub18) this.aClass66_9.method2225((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(30) byte[] local30 = this.aClass62_5.method2878(0, arg0);
		if (local30 == null) {
			return Static31.method524();
		} else {
			@Pc(40) Class4_Sub11 local40 = new Class4_Sub11(local30);
			local11 = new Class4_Sub1_Sub18(local40);
			this.aClass66_9.method2222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)I")
	@Override
	public int method381(@OriginalArg(0) int arg0) {
		return this.method391(arg0).anInt3909;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	public void method392() {
		this.aClass66_9 = new Class66(this.anInt584);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(FII)[I")
	@Override
	public int[] method386(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class4_Sub1_Sub18 local6 = this.method391(arg1);
		local6.aBoolean160 = true;
		return local6.method3007(this, this.aClass62_4, arg0, this.anInt585);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method384(@OriginalArg(0) int arg0) {
		return this.method391(arg0).aBoolean161;
	}
}
