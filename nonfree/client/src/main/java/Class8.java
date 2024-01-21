import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class8 implements Interface1 {

	@OriginalMember(owner = "client!bc", name = "O", descriptor = "I")
	private int anInt242 = 50;

	@OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
	private int anInt233 = 128;

	@OriginalMember(owner = "client!bc", name = "D", descriptor = "Lclient!bg;")
	private final Class11 aClass11_13;

	@OriginalMember(owner = "client!bc", name = "P", descriptor = "Lclient!bg;")
	private final Class11 aClass11_14;

	@OriginalMember(owner = "client!bc", name = "W", descriptor = "Lclient!rc;")
	private Class74 aClass74_9;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!bg;Lclient!bg;II)V")
	public Class8(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt233 = arg3;
		this.aClass11_13 = arg0;
		this.anInt242 = arg2;
		this.aClass11_14 = arg1;
		this.aClass74_9 = new Class74(this.anInt242);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public void method195() {
		this.aClass74_9 = new Class74(this.anInt242);
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(II)Z")
	@Override
	public boolean method190(@OriginalArg(0) int arg0) {
		return this.method201(arg0).aBoolean130;
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(II)Z")
	@Override
	public boolean method193(@OriginalArg(1) int arg0) {
		return this.method201(arg0).aBoolean132;
	}

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "(II)V")
	public void method196(@OriginalArg(1) int arg0) {
		for (@Pc(17) Class2_Sub2_Sub14 local17 = (Class2_Sub2_Sub14) this.aClass74_9.method2343(); local17 != null; local17 = (Class2_Sub2_Sub14) this.aClass74_9.method2346()) {
			if (local17.aBoolean133) {
				local17.method2457(arg0);
				local17.aBoolean133 = false;
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method187(@OriginalArg(0) int arg0) {
		return this.anInt233 == 64 || this.method201(arg0).anInt3172 == 64;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method189(@OriginalArg(0) int arg0) {
		return this.method201(arg0).method2450(this.aClass11_14, this);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IFB)[I")
	@Override
	public int[] method191(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(8) Class2_Sub2_Sub14 local8 = this.method201(arg0);
		local8.aBoolean133 = true;
		return local8.method2453(arg1, this, this.aClass11_14, this.anInt233);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)Lclient!sc;")
	private Class2_Sub2_Sub14 method201(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub2_Sub14 local16 = (Class2_Sub2_Sub14) this.aClass74_9.method2345((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(27) byte[] local27 = this.aClass11_13.method2049(arg0, 0);
		if (local27 == null) {
			return Static153.method2529();
		} else {
			@Pc(37) Class2_Sub13 local37 = new Class2_Sub13(local27);
			local16 = new Class2_Sub2_Sub14(local37);
			this.aClass74_9.method2341((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(IZ)[I")
	@Override
	public int[] method192(@OriginalArg(0) int arg0) {
		@Pc(18) Class2_Sub13 local18 = new Class2_Sub13(this.aClass11_13.method2049(arg0, 0));
		@Pc(23) Class2_Sub2_Sub14 local23 = new Class2_Sub2_Sub14(local18);
		return local23.method2456(this.anInt233, this, this.aClass11_14);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)I")
	@Override
	public int method188(@OriginalArg(0) int arg0) {
		return this.method201(arg0).anInt3177;
	}
}
