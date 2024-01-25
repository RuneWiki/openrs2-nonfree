import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public final class Class6_Sub5_Sub9 extends Class6_Sub5 {

	@OriginalMember(owner = "client!kt", name = "t", descriptor = "I")
	public int anInt4947;

	@OriginalMember(owner = "client!kt", name = "u", descriptor = "I")
	public int anInt4948;

	@OriginalMember(owner = "client!kt", name = "w", descriptor = "I")
	public int anInt4949;

	@OriginalMember(owner = "client!kt", name = "z", descriptor = "I")
	public int anInt4951;

	@OriginalMember(owner = "client!kt", name = "A", descriptor = "I")
	public int anInt4952;

	@OriginalMember(owner = "client!kt", name = "v", descriptor = "Lclient!vp;")
	public final Class335 aClass335_1;

	@OriginalMember(owner = "client!kt", name = "C", descriptor = "Lclient!rp;")
	public final Class282 aClass282_1;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!vp;Lclient!io;)V")
	public Class6_Sub5_Sub9(@OriginalArg(0) Class335 arg0, @OriginalArg(1) Class60_Sub4 arg1) {
		this.aClass335_1 = arg0;
		this.aClass282_1 = this.aClass335_1.method7729();
		this.method4192();
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V")
	public void method4192() {
		this.anInt4951 = this.aClass335_1.anInt9657;
		this.anInt4952 = this.aClass335_1.anInt9655;
		this.anInt4947 = this.aClass335_1.anInt9658;
		if (this.aClass335_1.aClass93_9 != null) {
			this.aClass335_1.aClass93_9.R(this.aClass282_1.anInt7985, this.aClass282_1.anInt7982, this.aClass282_1.anInt7976, Static410.anIntArray507);
		}
		this.anInt4949 = Static410.anIntArray507[0];
		this.anInt4948 = Static410.anIntArray507[2];
	}
}
