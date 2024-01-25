import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public final class Class45_Sub2 extends Class45 implements Interface8 {

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
	private int anInt5510;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!ge;I[BIZ)V")
	public Class45_Sub2(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5510 = arg1;
	}

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!ge;ILjava/nio/ByteBuffer;Z)V")
	public Class45_Sub2(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, 34962, arg2, arg3);
		this.anInt5510 = arg1;
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "()V")
	@Override
	protected void method4997() {
		this.aClass81_Sub1_35.method1967(this);
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(Lclient!jm;)V")
	@Override
	public void method5001(@OriginalArg(0) Class110 arg0) {
		this.aClass81_Sub1_35.anOpengl1.glColorPointer(arg0.aByte40, arg0.aShort41, this.anInt5510, (long) arg0.aByte41);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "()I")
	@Override
	public int method5116() {
		return super.method5116();
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILclient!jm;)V")
	@Override
	public void method5002(@OriginalArg(0) int arg0, @OriginalArg(1) Class110 arg1) {
		this.aClass81_Sub1_35.anOpengl1.glClientActiveTexture(arg0 + 33984);
		this.aClass81_Sub1_35.anOpengl1.glTexCoordPointer(arg1.aByte40, arg1.aShort41, this.anInt5510, (long) arg1.aByte41);
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(Lclient!jm;)V")
	@Override
	public void method5003(@OriginalArg(0) Class110 arg0) {
		this.aClass81_Sub1_35.anOpengl1.glVertexPointer(arg0.aByte40, arg0.aShort41, this.anInt5510, (long) arg0.aByte41);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!jm;)V")
	@Override
	public void method5000(@OriginalArg(0) Class110 arg0) {
		this.aClass81_Sub1_35.anOpengl1.glNormalPointer(arg0.aShort41, this.anInt5510, (long) arg0.aByte41);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method5004(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method4998(arg1, arg2);
		this.anInt5510 = arg0;
	}
}
