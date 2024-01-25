import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class Class1 implements Interface2 {

	@OriginalMember(owner = "client!a", name = "j", descriptor = "I")
	public final int anInt5016;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "Lclient!vn;")
	public final Class347 aClass347_6;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "I")
	public final int anInt5010;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "Lclient!mf;")
	public final Class214 aClass214_8;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "I")
	public final int anInt5012;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(ILclient!vn;Lclient!mf;II)V")
	public Class1(@OriginalArg(0) int arg0, @OriginalArg(1) Class347 arg1, @OriginalArg(2) Class214 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5016 = arg3;
		this.aClass347_6 = arg1;
		this.anInt5010 = arg4;
		this.aClass214_8 = arg2;
		this.anInt5012 = arg0;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)Lclient!kq;")
	@Override
	public Class184 method7073() {
		return Static201.aClass184_6;
	}
}
