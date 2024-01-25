import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public final class Class38_Sub1 extends Class38 {

	@OriginalMember(owner = "client!mca", name = "o", descriptor = "Ljava/lang/String;")
	public String aString132;

	@OriginalMember(owner = "client!mca", name = "q", descriptor = "I")
	public int anInt5576;

	@OriginalMember(owner = "client!mca", name = "r", descriptor = "Ljava/lang/String;")
	public String aString133;

	@OriginalMember(owner = "client!mca", name = "s", descriptor = "I")
	public int anInt5577 = -1;

	static {
		new Class45("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	}

	@OriginalMember(owner = "client!mca", name = "e", descriptor = "(I)Lclient!od;")
	public Class211 method5119() {
		return Static507.aClass211Array1[super.anInt5565];
	}
}
