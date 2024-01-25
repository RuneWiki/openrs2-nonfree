import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mda")
public final class Class182_Sub1 extends Class182 {

	@OriginalMember(owner = "client!mda", name = "k", descriptor = "I")
	private final int anInt5807;

	@OriginalMember(owner = "client!mda", name = "u", descriptor = "I")
	private final int anInt5815;

	@OriginalMember(owner = "client!mda", name = "o", descriptor = "I")
	private final int anInt5811;

	@OriginalMember(owner = "client!mda", name = "r", descriptor = "I")
	private final int anInt5813;

	static {
		new Class88("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(IIIIIII)V")
	public Class182_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5807 = arg0;
		this.anInt5815 = arg2;
		this.anInt5811 = arg1;
		this.anInt5813 = arg3;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(III)V")
	@Override
	public void method6586(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5807 >> 12;
		@Pc(17) int local17 = this.anInt5815 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt5811 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt5813 >> 12;
		Static476.method2143(super.anInt7942, local24, local31, local10, local17, super.anInt7941);
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IBI)V")
	@Override
	public void method6581(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5807 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt5815 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt5811 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt5813 >> 12;
		Static164.method3353(local10, local28, local35, super.anInt7939, local17);
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = this.anInt5807 * arg1 >> 12;
		@Pc(22) int local22 = arg1 * this.anInt5815 >> 12;
		@Pc(29) int local29 = arg0 * this.anInt5811 >> 12;
		@Pc(36) int local36 = this.anInt5813 * arg0 >> 12;
		Static305.method4967(local36, local22, super.anInt7939, local29, super.anInt7941, super.anInt7942, local15);
	}
}
