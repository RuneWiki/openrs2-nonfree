import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class Class256 implements Interface3 {

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "Lclient!ps;")
	public final Class291 aClass291_8;

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
	public final int anInt5986;

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "Lclient!ft;")
	public final Class125 aClass125_12;

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
	public final int anInt5985;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
	public final int anInt5984;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(ILclient!ps;Lclient!ft;II)V")
	public Class256(@OriginalArg(0) int arg0, @OriginalArg(1) Class291 arg1, @OriginalArg(2) Class125 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass291_8 = arg1;
		this.anInt5986 = arg3;
		this.aClass125_12 = arg2;
		this.anInt5985 = arg4;
		this.anInt5984 = arg0;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)Lclient!lf;")
	@Override
	public Class210 method7539() {
		return Static288.aClass210_8;
	}
}
