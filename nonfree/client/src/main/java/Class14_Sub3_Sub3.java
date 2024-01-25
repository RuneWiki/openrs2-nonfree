import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public abstract class Class14_Sub3_Sub3 extends Class14_Sub3 {

	@OriginalMember(owner = "client!kca", name = "A", descriptor = "Lclient!dr;")
	public final Interface5 anInterface5_3;

	@OriginalMember(owner = "client!kca", name = "D", descriptor = "I")
	public final int anInt6296;

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lclient!dr;I)V")
	protected Class14_Sub3_Sub3(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1) {
		this.anInterface5_3 = arg0;
		this.anInt6296 = arg1;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)Z")
	public abstract boolean method5210();

	@OriginalMember(owner = "client!kca", name = "e", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method5212();
}
