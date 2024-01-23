import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class190 {

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
	public int anInt6001;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
	public int anInt6000;

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
	public int anInt6005;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "Lclient!so;")
	public Class164 aClass164_2;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(IIII)V")
	public Class190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) Class164 local5 = Static284.method4679(arg0);
		this.anInt6001 = arg3;
		this.anInt6000 = arg2;
		this.anInt6005 = arg1;
		if (Static283.aBoolean393 || local5.anInt5339 == -1) {
			this.aClass164_2 = local5;
		} else {
			this.aClass164_2 = Static284.method4679(local5.anInt5339);
		}
	}

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!so;III)V")
	public Class190(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6000 = arg2;
		this.anInt6001 = arg3;
		this.anInt6005 = arg1;
		this.aClass164_2 = arg0;
	}
}
