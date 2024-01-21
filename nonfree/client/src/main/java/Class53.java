import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class53 implements Interface1 {

	@OriginalMember(owner = "client!md", name = "b", descriptor = "I")
	private int anInt2209 = 50;

	@OriginalMember(owner = "client!md", name = "q", descriptor = "I")
	private int anInt2220 = 128;

	@OriginalMember(owner = "client!md", name = "e", descriptor = "Lclient!f;")
	private final Class13 aClass13_17;

	@OriginalMember(owner = "client!md", name = "v", descriptor = "Lclient!f;")
	private final Class13 aClass13_18;

	@OriginalMember(owner = "client!md", name = "u", descriptor = "Lclient!b;")
	private Class7 aClass7_15;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!f;Lclient!f;II)V")
	public Class53(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass13_17 = arg0;
		this.aClass13_18 = arg1;
		this.anInt2209 = arg2;
		this.anInt2220 = arg3;
		this.aClass7_15 = new Class7(this.anInt2209);
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(II)Lclient!rf;")
	private Class3_Sub1_Sub16 method1725(@OriginalArg(0) int arg0) {
		@Pc(16) Class3_Sub1_Sub16 local16 = (Class3_Sub1_Sub16) this.aClass7_15.method183((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(27) byte[] local27 = this.aClass13_17.method348(0, arg0);
		if (local27 == null) {
			return Static113.method2035();
		} else {
			@Pc(34) Class3_Sub12 local34 = new Class3_Sub12(local27);
			local16 = new Class3_Sub1_Sub16(local34);
			this.aClass7_15.method186(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method1719(@OriginalArg(1) int arg0) {
		return this.method1725(arg0).aBoolean216;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method1722(@OriginalArg(0) int arg0) {
		return this.method1725(arg0).aBoolean218;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	public void method1727() {
		this.aClass7_15 = new Class7(this.anInt2209);
	}

	@OriginalMember(owner = "client!md", name = "e", descriptor = "(II)V")
	public void method1728(@OriginalArg(1) int arg0) {
		for (@Pc(20) Class3_Sub1_Sub16 local20 = (Class3_Sub1_Sub16) this.aClass7_15.method187(); local20 != null; local20 = (Class3_Sub1_Sub16) this.aClass7_15.method182()) {
			if (local20.aBoolean217) {
				local20.method2353(arg0);
				local20.aBoolean217 = false;
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(II)I")
	@Override
	public int method1724(@OriginalArg(0) int arg0) {
		return this.method1725(arg0).anInt3257;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(BI)Z")
	@Override
	public boolean method1723(@OriginalArg(1) int arg0) {
		return this.method1725(arg0).method2355(this, this.aClass13_18);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IFB)[I")
	@Override
	public int[] method1721(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(13) Class3_Sub1_Sub16 local13 = this.method1725(arg0);
		local13.aBoolean217 = true;
		return local13.method2352(this, arg1, this.anInt2220, this.aClass13_18);
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method1720(@OriginalArg(1) int arg0) {
		return this.anInt2220 == 64 || this.method1725(arg0).anInt3253 == 64;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method1718(@OriginalArg(1) int arg0) {
		@Pc(15) Class3_Sub12 local15 = new Class3_Sub12(this.aClass13_17.method348(0, arg0));
		@Pc(20) Class3_Sub1_Sub16 local20 = new Class3_Sub1_Sub16(local15);
		return local20.method2354(this, this.anInt2220, this.aClass13_18);
	}
}
