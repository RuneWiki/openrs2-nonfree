import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public final class Class48_Sub1 extends Class48 implements Interface8 {

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
	private int anInt1429;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!mm;I[BIZ)V")
	public Class48_Sub1(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt1429 = arg1;
	}

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!mm;ILjava/nio/ByteBuffer;Z)V")
	public Class48_Sub1(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, 34962, arg2, arg3);
		this.anInt1429 = arg1;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(Lclient!vl;)V")
	@Override
	public void method1361(@OriginalArg(0) Class203 arg0) {
		this.aClass55_Sub1_39.anOpengl1.glVertexPointer(arg0.aByte73, arg0.aShort87, this.anInt1429, (long) arg0.aByte74);
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(Lclient!vl;)V")
	@Override
	public void method1362(@OriginalArg(0) Class203 arg0) {
		this.aClass55_Sub1_39.anOpengl1.glNormalPointer(arg0.aShort87, this.anInt1429, (long) arg0.aByte74);
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "()V")
	@Override
	protected void method5664() {
		this.aClass55_Sub1_39.method3699(this);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!vl;)V")
	@Override
	public void method1360(@OriginalArg(0) Class203 arg0) {
		this.aClass55_Sub1_39.anOpengl1.glColorPointer(arg0.aByte73, arg0.aShort87, this.anInt1429, (long) arg0.aByte74);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method1363(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method5662(arg1, arg2);
		this.anInt1429 = arg0;
	}

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "(Lclient!vl;)V")
	@Override
	public void method1364(@OriginalArg(0) Class203 arg0) {
		this.aClass55_Sub1_39.anOpengl1.glTexCoordPointer(arg0.aByte73, arg0.aShort87, this.anInt1429, (long) arg0.aByte74);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "()I")
	@Override
	public int method5663() {
		return super.method5663();
	}
}
