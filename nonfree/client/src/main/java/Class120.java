import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public final class Class120 {

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "Lclient!sg;")
	public Interface6 anInterface6_3;

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "S")
	public final short aShort36;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "B")
	public byte aByte32;

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "Lclient!hj;")
	private final Class2_Sub1 aClass2_Sub1_24;

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "B")
	public final byte aByte33;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!hj;Lclient!sg;III)V")
	public Class120(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInterface6_3 = arg1;
		this.aShort36 = (short) arg2;
		this.aByte32 = (byte) arg4;
		this.aClass2_Sub1_24 = arg0;
		this.aByte33 = (byte) arg3;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
	public void method3551() {
		this.aClass2_Sub1_24.method2359(this.anInterface6_3);
		this.anInterface6_3.method1757(this);
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V")
	public void method3552() {
		this.aClass2_Sub1_24.method2359(this.anInterface6_3);
		this.anInterface6_3.method1755(this);
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)V")
	public void method3553() {
		this.aClass2_Sub1_24.method2359(this.anInterface6_3);
		this.anInterface6_3.method1759(this);
	}

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)V")
	public void method3554() {
		this.aClass2_Sub1_24.method2359(this.anInterface6_3);
		this.anInterface6_3.method1756(this);
	}
}
