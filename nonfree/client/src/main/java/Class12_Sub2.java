import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public final class Class12_Sub2 extends Class12 implements Interface8 {

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
	private int anInt751;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!mm;ILjava/nio/ByteBuffer;)V")
	public Class12_Sub2(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2) {
		super(arg0, arg2);
		this.anInt751 = arg1;
	}

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!mm;I[BI)V")
	public Class12_Sub2(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt751 = arg1;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method1363(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method657(arg1, arg2);
		this.anInt751 = arg0;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!vl;)V")
	@Override
	public void method1360(@OriginalArg(0) Class203 arg0) {
		this.aClass55_Sub1_9.anOpengl1.glColorPointer(arg0.aByte73, arg0.aShort87, this.anInt751, this.aByteBuffer3.position(arg0.aByte74));
	}

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "(Lclient!vl;)V")
	@Override
	public void method1364(@OriginalArg(0) Class203 arg0) {
		this.aClass55_Sub1_9.anOpengl1.glTexCoordPointer(arg0.aByte73, arg0.aShort87, this.anInt751, this.aByteBuffer3.position(arg0.aByte74));
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "()I")
	@Override
	public int method5663() {
		return 0;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(Lclient!vl;)V")
	@Override
	public void method1361(@OriginalArg(0) Class203 arg0) {
		this.aClass55_Sub1_9.anOpengl1.glVertexPointer(arg0.aByte73, arg0.aShort87, this.anInt751, this.aByteBuffer3.position(arg0.aByte74));
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(Lclient!vl;)V")
	@Override
	public void method1362(@OriginalArg(0) Class203 arg0) {
		this.aClass55_Sub1_9.anOpengl1.glNormalPointer(arg0.aShort87, this.anInt751, this.aByteBuffer3.position(arg0.aByte74));
	}
}
