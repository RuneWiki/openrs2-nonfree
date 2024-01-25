import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public final class Class136 {

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "Lclient!jd;")
	public Class38 aClass38_2;

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
	public int anInt4530;

	@OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
	public int anInt4532;

	@OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
	public int anInt4536;

	@OriginalMember(owner = "client!mp", name = "k", descriptor = "Lclient!mp;")
	public Class136 aClass136_1;

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
	public final int anInt4531;

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
	public final int anInt4533;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(II)V")
	public Class136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4531 = arg1;
		this.anInt4533 = arg0;
	}

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lclient!mp;I)V")
	public Class136(@OriginalArg(0) Class136 arg0, @OriginalArg(1) int arg1) {
		this.aClass136_1 = arg0;
		this.aClass38_2 = this.aClass136_1.aClass38_2;
		this.anInt4531 = arg1 + this.aClass136_1.anInt4531;
		this.anInt4533 = this.aClass136_1.anInt4533;
	}
}
