import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public final class Class395 implements Interface14 {

	@OriginalMember(owner = "client!wn", name = "n", descriptor = "I")
	public final int anInt11089;

	@OriginalMember(owner = "client!wn", name = "m", descriptor = "I")
	public final int anInt11082;

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
	public final int anInt11088;

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "Lclient!nv;")
	public final Class258 aClass258_15;

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
	public final int anInt11087;

	@OriginalMember(owner = "client!wn", name = "h", descriptor = "Lclient!kka;")
	public final Class205 aClass205_19;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
	public final int anInt11092;

	@OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
	public final int anInt11090;

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "Z")
	public final boolean aBoolean774;

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
	public final int anInt11094;

	@OriginalMember(owner = "client!wn", name = "o", descriptor = "I")
	public final int anInt11086;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(ILclient!nv;Lclient!kka;IIIIIIIZ)V")
	public Class395(@OriginalArg(0) int arg0, @OriginalArg(1) Class258 arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt11089 = arg8;
		this.anInt11082 = arg4;
		this.anInt11088 = arg7;
		this.aClass258_15 = arg1;
		this.anInt11087 = arg3;
		this.aClass205_19 = arg2;
		this.anInt11092 = arg6;
		this.anInt11090 = arg9;
		this.aBoolean774 = arg10;
		this.anInt11094 = arg0;
		this.anInt11086 = arg5;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)Lclient!c;")
	@Override
	public Class51 method9393() {
		return Static410.aClass51_23;
	}
}
