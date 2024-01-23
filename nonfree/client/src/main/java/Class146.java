import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class146 {

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
	public int anInt4475;

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
	public int anInt4477;

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
	public int anInt4472;

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "Lclient!aa;")
	public Class2 aClass2_2;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(IIII)V")
	public Class146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) Class2 local5 = Static122.method2215(arg0);
		this.anInt4475 = arg2;
		this.anInt4477 = arg3;
		this.anInt4472 = arg1;
		if (Static71.aBoolean165 || local5.anInt67 == -1) {
			this.aClass2_2 = local5;
		} else {
			this.aClass2_2 = Static122.method2215(local5.anInt67);
		}
	}

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!aa;III)V")
	public Class146(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4475 = arg2;
		this.anInt4477 = arg3;
		this.anInt4472 = arg1;
		this.aClass2_2 = arg0;
	}
}
