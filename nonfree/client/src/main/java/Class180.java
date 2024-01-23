import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class180 {

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
	public int anInt5139;

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
	public int anInt5137;

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
	public int anInt5135;

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "Lclient!so;")
	public Class165 aClass165_1;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(IIII)V")
	public Class180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) Class165 local5 = Static190.method3097(arg0);
		this.anInt5139 = arg2;
		this.anInt5137 = arg1;
		this.anInt5135 = arg3;
		if (Static156.aBoolean211 || local5.anInt4802 == -1) {
			this.aClass165_1 = local5;
		} else {
			this.aClass165_1 = Static190.method3097(local5.anInt4802);
		}
	}

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lclient!so;III)V")
	public Class180(@OriginalArg(0) Class165 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass165_1 = arg0;
		this.anInt5137 = arg1;
		this.anInt5135 = arg3;
		this.anInt5139 = arg2;
	}
}
