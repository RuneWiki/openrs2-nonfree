import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class39 implements Interface3 {

	@OriginalMember(owner = "client!he", name = "b", descriptor = "I")
	private int anInt1626 = 50;

	@OriginalMember(owner = "client!he", name = "w", descriptor = "I")
	private int anInt1643 = 128;

	@OriginalMember(owner = "client!he", name = "t", descriptor = "Lclient!eh;")
	private final Class28 aClass28_76;

	@OriginalMember(owner = "client!he", name = "k", descriptor = "Lclient!eh;")
	private final Class28 aClass28_75;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "Lclient!s;")
	private Class86 aClass86_23;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!eh;Lclient!eh;II)V")
	public Class39(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass28_76 = arg0;
		this.anInt1626 = arg2;
		this.aClass28_75 = arg1;
		this.anInt1643 = arg3;
		this.aClass86_23 = new Class86(this.anInt1626);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(FII)[I")
	@Override
	public int[] method1286(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub2_Sub7 local8 = this.method1296(arg1);
		local8.aBoolean70 = true;
		return local8.method937(this.anInt1643, this, arg0, this.aClass28_75);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1287(@OriginalArg(0) int arg0) {
		return this.method1296(arg0).aBoolean69;
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(II)Z")
	@Override
	public boolean method1289(@OriginalArg(1) int arg0) {
		return this.method1296(arg0).method939(this.aClass28_75, this);
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method1288(@OriginalArg(0) int arg0) {
		return this.anInt1643 == 64 || this.method1296(arg0).anInt1218 == 64;
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(II)Z")
	@Override
	public boolean method1290(@OriginalArg(0) int arg0) {
		return this.method1296(arg0).aBoolean66;
	}

	@OriginalMember(owner = "client!he", name = "f", descriptor = "(II)I")
	@Override
	public int method1292(@OriginalArg(1) int arg0) {
		return this.method1296(arg0).anInt1215;
	}

	@OriginalMember(owner = "client!he", name = "g", descriptor = "(II)Lclient!ei;")
	private Class2_Sub2_Sub7 method1296(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub2_Sub7 local16 = (Class2_Sub2_Sub7) this.aClass86_23.method2643((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(27) byte[] local27 = this.aClass28_76.method852(arg0, 0);
		if (local27 == null) {
			return Static138.method2244();
		} else {
			@Pc(37) Class2_Sub3 local37 = new Class2_Sub3(local27);
			local16 = new Class2_Sub2_Sub7(local37);
			this.aClass86_23.method2647(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
	public void method1297() {
		this.aClass86_23 = new Class86(this.anInt1626);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)V")
	public void method1298(@OriginalArg(0) int arg0) {
		for (@Pc(17) Class2_Sub2_Sub7 local17 = (Class2_Sub2_Sub7) this.aClass86_23.method2650(); local17 != null; local17 = (Class2_Sub2_Sub7) this.aClass86_23.method2642()) {
			if (local17.aBoolean70) {
				local17.method940(arg0);
				local17.aBoolean70 = false;
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(II)[I")
	@Override
	public int[] method1291(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub2_Sub7 local8 = this.method1296(arg0);
		return local8.method936(this, this.aClass28_75, this.anInt1643);
	}
}
