import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class29_Sub13 extends Class29 {

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
	private final int anInt6633;

	@OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
	private final int anInt6630;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class29_Sub13(@OriginalArg(0) Class3_Sub2 arg0) {
		super(arg0);
		this.anInt6633 = arg0.method2028(-14795);
		this.anInt6630 = arg0.method2030();
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V")
	@Override
	public void method9495() {
		@Pc(16) Class401 local16 = Static134.aClass401Array1[this.anInt6633];
		Static83.method9523(local16.anInt11112, local16.anInt11114, local16.anInt11118, local16.anInt11115, local16.anInt11113, Static637.anIntArray649[local16.anInt11114], this.anInt6630);
	}
}
