import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class Class58 implements Interface15 {

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
	public final int anInt10052;

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
	public final int anInt10050;

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
	public final int anInt10056;

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
	public final int anInt10055;

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
	public final int anInt10053;

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
	public final int anInt10051;

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
	public final int anInt10054;

	@OriginalMember(owner = "client!sq", name = "n", descriptor = "Lclient!mq;")
	public final Class238 aClass238_13;

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "Lclient!rj;")
	public final Class318 aClass318_20;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!rj;Lclient!mq;IIIIIII)V")
	public Class58(@OriginalArg(0) Class318 arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt10052 = arg4;
		this.anInt10050 = arg5;
		this.anInt10056 = arg8;
		this.anInt10055 = arg3;
		this.anInt10053 = arg6;
		this.anInt10051 = arg2;
		this.anInt10054 = arg7;
		this.aClass238_13 = arg1;
		this.aClass318_20 = arg0;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)Lclient!uu;")
	@Override
	public Class369 method8734() {
		return null;
	}
}
