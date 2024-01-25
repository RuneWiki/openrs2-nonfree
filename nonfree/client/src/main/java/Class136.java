import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public final class Class136 {

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "Lclient!od;")
	private final Class128_Sub2 aClass128_Sub2_20;

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "J")
	public final long aLong102;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!od;J[Lclient!lv;)V")
	public Class136(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class153[] arg2) {
		this.aClass128_Sub2_20 = arg0;
		this.aLong102 = arg1;
	}

	@OriginalMember(owner = "client!kh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass128_Sub2_20.method3662(this.aLong102);
		super.finalize();
	}
}
