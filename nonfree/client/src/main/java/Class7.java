import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class7 implements Interface2 {

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
	private int anInt419 = 50;

	@OriginalMember(owner = "client!bg", name = "w", descriptor = "I")
	private int anInt431 = 128;

	@OriginalMember(owner = "client!bg", name = "t", descriptor = "Lclient!kh;")
	private final Class29 aClass29_10;

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "Lclient!kh;")
	private final Class29 aClass29_9;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "Lclient!sa;")
	private Class72 aClass72_1;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!kh;Lclient!kh;II)V")
	public Class7(@OriginalArg(0) Class29 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt431 = arg3;
		this.anInt419 = arg2;
		this.aClass29_10 = arg1;
		this.aClass29_9 = arg0;
		this.aClass72_1 = new Class72(this.anInt419);
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(II)Z")
	@Override
	public boolean method255(@OriginalArg(1) int arg0) {
		return this.method270(arg0).aBoolean71;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
	public void method260() {
		this.aClass72_1 = new Class72(this.anInt419);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method252(@OriginalArg(0) int arg0) {
		return this.method270(arg0).method1161(this, this.aClass29_10);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIF)[I")
	@Override
	public int[] method254(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1) {
		@Pc(14) Class2_Sub1_Sub7 local14 = this.method270(arg0);
		local14.aBoolean72 = true;
		return local14.method1156(this, this.aClass29_10, this.anInt431, arg1);
	}

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "(II)V")
	public void method266(@OriginalArg(0) int arg0) {
		for (@Pc(7) Class2_Sub1_Sub7 local7 = (Class2_Sub1_Sub7) this.aClass72_1.method2258(); local7 != null; local7 = (Class2_Sub1_Sub7) this.aClass72_1.method2262()) {
			if (local7.aBoolean72) {
				local7.method1160(arg0);
				local7.aBoolean72 = false;
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(II)Z")
	@Override
	public boolean method256(@OriginalArg(0) int arg0) {
		return this.method270(arg0).aBoolean73;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method253(@OriginalArg(1) int arg0) {
		return this.anInt431 == 64 || this.method270(arg0).anInt1624 == 64;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method258(@OriginalArg(1) int arg0) {
		@Pc(14) Class2_Sub11 local14 = new Class2_Sub11(this.aClass29_9.method1030(arg0, 0));
		@Pc(19) Class2_Sub1_Sub7 local19 = new Class2_Sub1_Sub7(local14);
		return local19.method1157(this.aClass29_10, this, this.anInt431);
	}

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "(II)I")
	@Override
	public int method257(@OriginalArg(1) int arg0) {
		return this.method270(arg0).anInt1618;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(BI)Lclient!i;")
	private Class2_Sub1_Sub7 method270(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub1_Sub7 local16 = (Class2_Sub1_Sub7) this.aClass72_1.method2259((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(27) byte[] local27 = this.aClass29_9.method1030(arg0, 0);
		if (local27 == null) {
			return Static59.method1076();
		} else {
			@Pc(34) Class2_Sub11 local34 = new Class2_Sub11(local27);
			local16 = new Class2_Sub1_Sub7(local34);
			this.aClass72_1.method2254(local16, (long) arg0);
			return local16;
		}
	}
}
