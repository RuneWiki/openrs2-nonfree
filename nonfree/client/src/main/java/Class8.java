import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class Class8 implements Interface4 {

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
	public final int anInt5331;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
	public final int anInt5337;

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
	public final int anInt5338;

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "Lclient!jha;")
	public final Class176 aClass176_10;

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
	public final int anInt5341;

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "Lclient!jg;")
	public final Class174 aClass174_11;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
	public final int anInt5330;

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
	public final int anInt5340;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
	public final int anInt5334;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!jg;Lclient!jha;IIIIIII)V")
	public Class8(@OriginalArg(0) Class174 arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt5331 = arg3;
		this.anInt5337 = arg7;
		this.anInt5338 = arg2;
		this.aClass176_10 = arg1;
		this.anInt5341 = arg8;
		this.aClass174_11 = arg0;
		this.anInt5330 = arg5;
		this.anInt5340 = arg6;
		this.anInt5334 = arg4;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)Lclient!jw;")
	@Override
	public Class184 method7078() {
		return null;
	}
}
