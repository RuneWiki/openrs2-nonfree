import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public final class Class189 implements Interface12 {

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "Lclient!ce;")
	public final Class49 aClass49_7;

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "I")
	public final int anInt5387;

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
	public final int anInt5389;

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
	public final int anInt5386;

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "Lclient!ida;")
	public final Class148 aClass148_6;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString63;

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
	public final int anInt5388;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!ida;Lclient!ce;IIII)V")
	public Class189(@OriginalArg(0) String arg0, @OriginalArg(1) Class148 arg1, @OriginalArg(2) Class49 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass49_7 = arg2;
		this.anInt5387 = arg6;
		this.anInt5389 = arg4;
		this.anInt5386 = arg5;
		this.aClass148_6 = arg1;
		this.aString63 = arg0;
		this.anInt5388 = arg3;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)Lclient!qv;")
	@Override
	public Class271 method8097() {
		return Static451.aClass271_6;
	}
}
