import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class82 implements Interface2 {

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
	private int anInt4468 = 50;

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
	private int anInt4466 = 128;

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "Lclient!u;")
	private final Class76 aClass76_131;

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "Lclient!u;")
	private final Class76 aClass76_132;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "Lclient!fc;")
	private Class25 aClass25_27;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!u;Lclient!u;II)V")
	public Class82(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4468 = arg2;
		this.anInt4466 = arg3;
		this.aClass76_131 = arg1;
		this.aClass76_132 = arg0;
		this.aClass25_27 = new Class25(this.anInt4468);
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(BI)Z")
	@Override
	public boolean method3419(@OriginalArg(1) int arg0) {
		return this.method3426(arg0).method1880(this.aClass76_131, this);
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(II)V")
	public void method3423(@OriginalArg(0) int arg0) {
		for (@Pc(11) Class1_Sub1_Sub11 local11 = (Class1_Sub1_Sub11) this.aClass25_27.method1298(); local11 != null; local11 = (Class1_Sub1_Sub11) this.aClass25_27.method1301()) {
			if (local11.aBoolean96) {
				local11.method1884(arg0);
				local11.aBoolean96 = false;
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method3422(@OriginalArg(0) int arg0) {
		return this.anInt4466 == 64 || this.method3426(arg0).anInt2541 == 64;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BIF)[I")
	@Override
	public int[] method3418(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1) {
		@Pc(14) Class1_Sub1_Sub11 local14 = this.method3426(arg0);
		local14.aBoolean96 = true;
		return local14.method1882(this.aClass76_131, this.anInt4466, this, arg1);
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(BI)[I")
	@Override
	public int[] method3421(@OriginalArg(1) int arg0) {
		@Pc(19) Class1_Sub9 local19 = new Class1_Sub9(this.aClass76_132.method3316(arg0, 0));
		@Pc(24) Class1_Sub1_Sub11 local24 = new Class1_Sub1_Sub11(local19);
		return local24.method1883(this.aClass76_131, this.anInt4466, this);
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(BI)Lclient!jf;")
	private Class1_Sub1_Sub11 method3426(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub1_Sub11 local12 = (Class1_Sub1_Sub11) this.aClass25_27.method1302((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(27) byte[] local27 = this.aClass76_132.method3316(arg0, 0);
		if (local27 == null) {
			return Static168.method1666();
		} else {
			@Pc(37) Class1_Sub9 local37 = new Class1_Sub9(local27);
			local12 = new Class1_Sub1_Sub11(local37);
			this.aClass25_27.method1299(local12, (long) arg0);
			return local12;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method3417(@OriginalArg(1) int arg0) {
		return this.method3426(arg0).aBoolean97;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)I")
	@Override
	public int method3416(@OriginalArg(0) int arg0) {
		return this.method3426(arg0).anInt2544;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
	public void method3428() {
		this.aClass25_27 = new Class25(this.anInt4468);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method3420(@OriginalArg(0) int arg0) {
		return this.method3426(arg0).aBoolean98;
	}
}
