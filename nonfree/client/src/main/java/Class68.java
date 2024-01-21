import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class68 implements Interface1 {

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
	private int anInt3741 = 128;

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
	private int anInt3742 = 50;

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "Lclient!pe;")
	private final Class13 aClass13_30;

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "Lclient!pe;")
	private final Class13 aClass13_29;

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "Lclient!vc;")
	private Class89 aClass89_53;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lclient!pe;Lclient!pe;II)V")
	public Class68(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass13_30 = arg0;
		this.anInt3742 = arg2;
		this.aClass13_29 = arg1;
		this.anInt3741 = arg3;
		this.aClass89_53 = new Class89(this.anInt3742);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method2881(@OriginalArg(0) int arg0) {
		return this.anInt3741 == 64 || this.method2889(arg0).anInt1815 == 64;
	}

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(II)V")
	public void method2888(@OriginalArg(0) int arg0) {
		for (@Pc(15) Class2_Sub1_Sub10 local15 = (Class2_Sub1_Sub10) this.aClass89_53.method3435(); local15 != null; local15 = (Class2_Sub1_Sub10) this.aClass89_53.method3436()) {
			if (local15.aBoolean75) {
				local15.method1354(arg0);
				local15.aBoolean75 = false;
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BFI)[I")
	@Override
	public int[] method2883(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class2_Sub1_Sub10 local16 = this.method2889(arg1);
		local16.aBoolean75 = true;
		return local16.method1357(this, arg0, this.anInt3741, this.aClass13_29);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BI)Lclient!g;")
	private Class2_Sub1_Sub10 method2889(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub1_Sub10 local16 = (Class2_Sub1_Sub10) this.aClass89_53.method3437((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(27) byte[] local27 = this.aClass13_30.method521(arg0, 0);
		if (local27 == null) {
			return Static19.method2424();
		} else {
			@Pc(34) Class2_Sub3 local34 = new Class2_Sub3(local27);
			local16 = new Class2_Sub1_Sub10(local34);
			this.aClass89_53.method3432(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(II)Z")
	@Override
	public boolean method2886(@OriginalArg(1) int arg0) {
		return this.method2889(arg0).method1358(this.aClass13_29, this);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2885(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub1_Sub10 local12 = this.method2889(arg0);
		return local12.method1359(this.anInt3741, this.aClass13_29, this);
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method2882(@OriginalArg(0) int arg0) {
		return this.method2889(arg0).aBoolean72;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method2887(@OriginalArg(1) int arg0) {
		return this.method2889(arg0).aBoolean71;
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
	public void method2892() {
		this.aClass89_53 = new Class89(this.anInt3742);
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)I")
	@Override
	public int method2884(@OriginalArg(0) int arg0) {
		return this.method2889(arg0).anInt1822;
	}
}
