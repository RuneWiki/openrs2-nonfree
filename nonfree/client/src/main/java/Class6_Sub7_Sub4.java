import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qga")
public final class Class6_Sub7_Sub4 extends Class6_Sub7 {

	@OriginalMember(owner = "client!qga", name = "o", descriptor = "Ljava/lang/String;")
	private String aString111;

	@OriginalMember(owner = "client!qga", name = "p", descriptor = "I")
	private int anInt8207;

	@OriginalMember(owner = "client!qga", name = "r", descriptor = "B")
	private byte aByte113;

	@OriginalMember(owner = "client!qga", name = "u", descriptor = "I")
	private int anInt8211 = -1;

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lclient!ag;I)V")
	@Override
	public void method6990(@OriginalArg(0) Class6_Sub2 arg0) {
		@Pc(13) Class157 local13 = arg0.aClass157Array1[this.anInt8211];
		local13.anInt4293 = this.anInt8207;
		local13.aByte77 = this.aByte113;
		local13.aString50 = this.aString111;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lclient!gga;B)V")
	@Override
	public void method6993(@OriginalArg(0) Class6_Sub23 arg0) {
		this.anInt8211 = arg0.method8363();
		this.aByte113 = arg0.method8391();
		this.anInt8207 = arg0.method8363();
		arg0.method8381();
		this.aString111 = arg0.method8354();
	}
}
