import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class84 implements Interface2 {

	@OriginalMember(owner = "client!va", name = "h", descriptor = "I")
	private int anInt3807 = 128;

	@OriginalMember(owner = "client!va", name = "s", descriptor = "I")
	private int anInt3814 = 50;

	@OriginalMember(owner = "client!va", name = "n", descriptor = "Lclient!jc;")
	private final Class40 aClass40_36;

	@OriginalMember(owner = "client!va", name = "k", descriptor = "Lclient!jc;")
	private final Class40 aClass40_35;

	@OriginalMember(owner = "client!va", name = "e", descriptor = "Lclient!ch;")
	private Class14 aClass14_191;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!jc;Lclient!jc;II)V")
	public Class84(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3807 = arg3;
		this.aClass40_36 = arg1;
		this.anInt3814 = arg2;
		this.aClass40_35 = arg0;
		this.aClass14_191 = new Class14(this.anInt3814);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ)V")
	public void method2666(@OriginalArg(0) int arg0) {
		for (@Pc(11) Class2_Sub4_Sub10 local11 = (Class2_Sub4_Sub10) this.aClass14_191.method601(); local11 != null; local11 = (Class2_Sub4_Sub10) this.aClass14_191.method598()) {
			if (local11.aBoolean75) {
				local11.method1000(arg0);
				local11.aBoolean75 = false;
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
	public void method2667() {
		this.aClass14_191 = new Class14(this.anInt3814);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)Lclient!fg;")
	private Class2_Sub4_Sub10 method2668(@OriginalArg(1) int arg0) {
		@Pc(11) Class2_Sub4_Sub10 local11 = (Class2_Sub4_Sub10) this.aClass14_191.method603((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(22) byte[] local22 = this.aClass40_35.method1771(0, arg0);
		if (local22 == null) {
			return Static166.method2581();
		} else {
			@Pc(37) Class2_Sub2 local37 = new Class2_Sub2(local22);
			local11 = new Class2_Sub4_Sub10(local37);
			this.aClass14_191.method607((long) arg0, local11);
			return local11;
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method2661(@OriginalArg(1) int arg0) {
		return this.method2668(arg0).aBoolean74;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(II)Z")
	@Override
	public boolean method2663(@OriginalArg(1) int arg0) {
		return this.method2668(arg0).aBoolean73;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method2660(@OriginalArg(0) int arg0) {
		return this.method2668(arg0).method1001(this.aClass40_36, this);
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(IB)Z")
	@Override
	public boolean method2664(@OriginalArg(0) int arg0) {
		return this.anInt3807 == 64 || this.method2668(arg0).anInt1451 == 64;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)I")
	@Override
	public int method2659(@OriginalArg(1) int arg0) {
		return this.method2668(arg0).anInt1452;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(IB)[I")
	@Override
	public int[] method2665(@OriginalArg(0) int arg0) {
		@Pc(18) Class2_Sub2 local18 = new Class2_Sub2(this.aClass40_35.method1771(0, arg0));
		@Pc(23) Class2_Sub4_Sub10 local23 = new Class2_Sub4_Sub10(local18);
		return local23.method1005(this.anInt3807, this, this.aClass40_36);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(FII)[I")
	@Override
	public int[] method2662(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub4_Sub10 local12 = this.method2668(arg1);
		local12.aBoolean75 = true;
		return local12.method1004(this.anInt3807, arg0, this, this.aClass40_36);
	}
}
