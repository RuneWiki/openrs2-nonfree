import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class204 {

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "[Lclient!es;")
	private Class51_Sub1[] aClass51_Sub1Array3;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "Lclient!at;")
	private Class1_Sub7 aClass1_Sub7_8;

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "Lclient!nb;")
	private final Class143 aClass143_3;

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "Lclient!sp;")
	private final Class191 aClass191_3;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "Lclient!bl;")
	private Class1_Sub4_Sub2_Sub1 aClass1_Sub4_Sub2_Sub1_2;

	static {
		new Class106("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	}

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!sp;Lclient!nb;)V")
	public Class204(@OriginalArg(0) Class191 arg0, @OriginalArg(1) Class143 arg1) {
		this.aClass143_3 = arg1;
		this.aClass191_3 = arg0;
		if (!this.aClass191_3.method5181()) {
			this.aClass1_Sub4_Sub2_Sub1_2 = this.aClass191_3.method5191(255, 255, true, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!cq;ZLclient!cq;I)Lclient!es;")
	private Class51_Sub1 method5499(@OriginalArg(1) Class28 arg0, @OriginalArg(3) Class28 arg1, @OriginalArg(4) int arg2) {
		if (this.aClass1_Sub7_8 == null) {
			throw new RuntimeException();
		}
		this.aClass1_Sub7_8.anInt2219 = arg2 * 8 + 5;
		if (this.aClass1_Sub7_8.aByteArray41.length <= this.aClass1_Sub7_8.anInt2219) {
			throw new RuntimeException();
		} else if (this.aClass51_Sub1Array3[arg2] == null) {
			@Pc(55) int local55 = this.aClass1_Sub7_8.method2140();
			@Pc(60) int local60 = this.aClass1_Sub7_8.method2140();
			@Pc(74) Class51_Sub1 local74 = new Class51_Sub1(arg2, arg0, arg1, this.aClass191_3, this.aClass143_3, local55, local60, true);
			this.aClass51_Sub1Array3[arg2] = local74;
			return local74;
		} else {
			return this.aClass51_Sub1Array3[arg2];
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
	public void method5501() {
		if (this.aClass51_Sub1Array3 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass51_Sub1Array3.length; local11++) {
			if (this.aClass51_Sub1Array3[local11] != null) {
				this.aClass51_Sub1Array3[local11].method1734();
			}
		}
		for (@Pc(36) int local36 = 0; local36 < this.aClass51_Sub1Array3.length; local36++) {
			if (this.aClass51_Sub1Array3[local36] != null) {
				this.aClass51_Sub1Array3[local36].method1741();
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLclient!cq;ILclient!cq;)Lclient!es;")
	public Class51_Sub1 method5502(@OriginalArg(1) Class28 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class28 arg2) {
		return this.method5499(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)Z")
	public boolean method5503() {
		if (this.aClass1_Sub7_8 != null) {
			return true;
		}
		if (this.aClass1_Sub4_Sub2_Sub1_2 == null) {
			if (this.aClass191_3.method5181()) {
				return false;
			}
			this.aClass1_Sub4_Sub2_Sub1_2 = this.aClass191_3.method5191(255, 255, true, (byte) 0);
		}
		if (this.aClass1_Sub4_Sub2_Sub1_2.aBoolean367) {
			return false;
		} else {
			this.aClass1_Sub7_8 = new Class1_Sub7(this.aClass1_Sub4_Sub2_Sub1_2.method4468());
			this.aClass51_Sub1Array3 = new Class51_Sub1[(this.aClass1_Sub7_8.aByteArray41.length - 5) / 8];
			return true;
		}
	}
}
