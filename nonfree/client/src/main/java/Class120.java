import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public final class Class120 {

	@OriginalMember(owner = "client!il", name = "a", descriptor = "Lclient!il;")
	public Class120 aClass120_2;

	@OriginalMember(owner = "client!il", name = "d", descriptor = "I")
	public int anInt3174;

	@OriginalMember(owner = "client!il", name = "h", descriptor = "I")
	public int anInt3176;

	@OriginalMember(owner = "client!il", name = "l", descriptor = "I")
	public int anInt3179;

	@OriginalMember(owner = "client!il", name = "o", descriptor = "Lclient!ia;")
	public Class116 aClass116_2;

	@OriginalMember(owner = "client!il", name = "b", descriptor = "I")
	public final int anInt3172;

	@OriginalMember(owner = "client!il", name = "m", descriptor = "I")
	public final int anInt3180;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(II)V")
	public Class120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3172 = arg1;
		this.anInt3180 = arg0;
	}

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!il;I)V")
	public Class120(@OriginalArg(0) Class120 arg0, @OriginalArg(1) int arg1) {
		this.aClass120_2 = arg0;
		this.anInt3172 = this.aClass120_2.anInt3172 + arg1;
		this.aClass116_2 = this.aClass120_2.aClass116_2;
		this.anInt3180 = this.aClass120_2.anInt3180;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)Lclient!mb;")
	public Class153 method2498() {
		return Static359.method5002(this.anInt3180);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(II)Lclient!il;")
	public Class120 method2501(@OriginalArg(0) int arg0) {
		return new Class120(this.anInt3180, arg0);
	}
}
