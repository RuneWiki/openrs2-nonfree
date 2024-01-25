import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class Class63 implements Interface13 {

	@OriginalMember(owner = "client!dda", name = "h", descriptor = "I")
	public final int anInt8535;

	@OriginalMember(owner = "client!dda", name = "f", descriptor = "Lclient!ada;")
	public final Class7 aClass7_9;

	@OriginalMember(owner = "client!dda", name = "i", descriptor = "I")
	public final int anInt8536;

	@OriginalMember(owner = "client!dda", name = "d", descriptor = "I")
	public final int anInt8533;

	@OriginalMember(owner = "client!dda", name = "j", descriptor = "I")
	public final int anInt8537;

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "Lclient!oe;")
	public final Class249 aClass249_12;

	@OriginalMember(owner = "client!dda", name = "g", descriptor = "I")
	public final int anInt8534;

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "I")
	public final int anInt8532;

	@OriginalMember(owner = "client!dda", name = "k", descriptor = "I")
	public final int anInt8538;

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lclient!ada;Lclient!oe;IIIIIII)V")
	public Class63(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class249 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt8535 = arg7;
		this.aClass7_9 = arg0;
		this.anInt8536 = arg5;
		this.anInt8533 = arg2;
		this.anInt8537 = arg4;
		this.aClass249_12 = arg1;
		this.anInt8534 = arg8;
		this.anInt8532 = arg3;
		this.anInt8538 = arg6;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)Lclient!of;")
	@Override
	public Class251 method8737() {
		return null;
	}
}
