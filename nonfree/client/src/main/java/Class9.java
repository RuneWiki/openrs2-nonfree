import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class Class9 implements Interface19 {

	@OriginalMember(owner = "client!iea", name = "e", descriptor = "I")
	public final int anInt5030;

	@OriginalMember(owner = "client!iea", name = "k", descriptor = "I")
	public final int anInt5035;

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "I")
	public final int anInt5027;

	@OriginalMember(owner = "client!iea", name = "i", descriptor = "I")
	public final int anInt5034;

	@OriginalMember(owner = "client!iea", name = "g", descriptor = "I")
	public final int anInt5032;

	@OriginalMember(owner = "client!iea", name = "m", descriptor = "Lclient!ct;")
	public final Class62 aClass62_10;

	@OriginalMember(owner = "client!iea", name = "d", descriptor = "I")
	public final int anInt5029;

	@OriginalMember(owner = "client!iea", name = "f", descriptor = "I")
	public final int anInt5031;

	@OriginalMember(owner = "client!iea", name = "j", descriptor = "Lclient!rc;")
	public final Class279 aClass279_9;

	@OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Lclient!ct;Lclient!rc;IIIIIII)V")
	public Class9(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class279 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt5030 = arg5;
		this.anInt5035 = arg2;
		this.anInt5027 = arg7;
		this.anInt5034 = arg4;
		this.anInt5032 = arg6;
		this.aClass62_10 = arg0;
		this.anInt5029 = arg3;
		this.anInt5031 = arg8;
		this.aClass279_9 = arg1;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)Lclient!wea;")
	@Override
	public Class357 method7127() {
		return null;
	}
}
