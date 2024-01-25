import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public final class Class103_Sub1 extends Class103 implements Interface12 {

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
	private int anInt3940;

	static {
		new Class256("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	}

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!bo;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class103_Sub1(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt3940 = arg1;
	}

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!bo;I[BIZ)V")
	public Class103_Sub1(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt3940 = arg1;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)I")
	@Override
	public int method3159() {
		return super.anInt4426;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
	@Override
	protected void method3579() {
		super.aClass26_Sub1_22.method649(this);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)I")
	@Override
	public int method3158() {
		return this.anInt3940;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)J")
	@Override
	public long method3157() {
		return 0L;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B[BII)V")
	@Override
	public void method3160(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method3580(arg0, arg2);
		this.anInt3940 = arg1;
	}
}
