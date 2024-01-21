import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class27 implements Interface3 {

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
	private int anInt1375 = 50;

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
	private int anInt1377 = 128;

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "Lclient!vb;")
	private final Class82 aClass82_24;

	@OriginalMember(owner = "client!ge", name = "y", descriptor = "Lclient!vb;")
	private final Class82 aClass82_25;

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "Lclient!nd;")
	private Class59 aClass59_12;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!vb;Lclient!vb;II)V")
	public Class27(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1375 = arg2;
		this.aClass82_24 = arg0;
		this.anInt1377 = arg3;
		this.aClass82_25 = arg1;
		this.aClass59_12 = new Class59(this.anInt1375);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public void method1030() {
		this.aClass59_12 = new Class59(this.anInt1375);
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(II)Z")
	@Override
	public boolean method1028(@OriginalArg(1) int arg0) {
		return this.method1031(arg0).method392(this, this.aClass82_25);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method1025(@OriginalArg(0) int arg0) {
		return this.method1031(arg0).aBoolean10;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method1023(@OriginalArg(0) int arg0) {
		@Pc(18) Class1_Sub8 local18 = new Class1_Sub8(this.aClass82_24.method2942(arg0, 0));
		@Pc(23) Class1_Sub2_Sub3 local23 = new Class1_Sub2_Sub3(local18);
		return local23.method390(this, this.anInt1377, this.aClass82_25);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)Lclient!bh;")
	private Class1_Sub2_Sub3 method1031(@OriginalArg(1) int arg0) {
		@Pc(7) Class1_Sub2_Sub3 local7 = (Class1_Sub2_Sub3) this.aClass59_12.method1970((long) arg0);
		if (local7 != null) {
			return local7;
		}
		@Pc(27) byte[] local27 = this.aClass82_24.method2942(arg0, 0);
		if (local27 == null) {
			return Static136.method2281();
		} else {
			@Pc(37) Class1_Sub8 local37 = new Class1_Sub8(local27);
			local7 = new Class1_Sub2_Sub3(local37);
			this.aClass59_12.method1973(local7, (long) arg0);
			return local7;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(FII)[I")
	@Override
	public int[] method1024(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1) {
		@Pc(4) Class1_Sub2_Sub3 local4 = this.method1031(arg1);
		local4.aBoolean11 = true;
		return local4.method389(this.anInt1377, this.aClass82_25, arg0, this);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)Z")
	@Override
	public boolean method1026(@OriginalArg(0) int arg0) {
		return this.anInt1377 == 64 || this.method1031(arg0).anInt474 == 64;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(II)I")
	@Override
	public int method1027(@OriginalArg(0) int arg0) {
		return this.method1031(arg0).anInt480;
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(II)Z")
	@Override
	public boolean method1029(@OriginalArg(1) int arg0) {
		return this.method1031(arg0).aBoolean9;
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(II)V")
	public void method1034(@OriginalArg(1) int arg0) {
		for (@Pc(15) Class1_Sub2_Sub3 local15 = (Class1_Sub2_Sub3) this.aClass59_12.method1966(); local15 != null; local15 = (Class1_Sub2_Sub3) this.aClass59_12.method1972()) {
			if (local15.aBoolean11) {
				local15.method393(arg0);
				local15.aBoolean11 = false;
			}
		}
	}
}
