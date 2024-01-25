import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class3_Sub5_Sub2 extends Class3_Sub5 {

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(I)V")
	public Class3_Sub5_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IF)V")
	public void method2793(@OriginalArg(1) float arg0) {
		@Pc(9) int local9 = Float.floatToRawIntBits(arg0);
		this.aByteArray42[this.anInt3121++] = (byte) local9;
		this.aByteArray42[this.anInt3121++] = (byte) (local9 >> 8);
		this.aByteArray42[this.anInt3121++] = (byte) (local9 >> 16);
		this.aByteArray42[this.anInt3121++] = (byte) (local9 >> 24);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(FB)V")
	public void method2794(@OriginalArg(0) float arg0) {
		@Pc(9) int local9 = Float.floatToRawIntBits(arg0);
		this.aByteArray42[this.anInt3121++] = (byte) (local9 >> 24);
		this.aByteArray42[this.anInt3121++] = (byte) (local9 >> 16);
		this.aByteArray42[this.anInt3121++] = (byte) (local9 >> 8);
		this.aByteArray42[this.anInt3121++] = (byte) local9;
	}
}
