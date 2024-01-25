import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public final class Class84 {

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "B")
	public final byte aByte36;

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "Lclient!nf;")
	private final Class105_Sub1 aClass105_Sub1_18;

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "S")
	public final short aShort41;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "Lclient!na;")
	public Interface9 anInterface9_1;

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "B")
	public byte aByte37;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!nf;Lclient!na;III)V")
	public Class84(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) Interface9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aByte36 = (byte) arg3;
		this.aClass105_Sub1_18 = arg0;
		this.aShort41 = (short) arg2;
		this.anInterface9_1 = arg1;
		this.aByte37 = (byte) arg4;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V")
	public void method1630() {
		this.aClass105_Sub1_18.method3607(this.anInterface9_1);
		this.anInterface9_1.method4197(this);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
	public void method1631() {
		this.aClass105_Sub1_18.method3607(this.anInterface9_1);
		this.anInterface9_1.method4196(this);
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V")
	public void method1632() {
		this.aClass105_Sub1_18.method3607(this.anInterface9_1);
		this.anInterface9_1.method4195(this);
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(B)V")
	public void method1633() {
		this.aClass105_Sub1_18.method3607(this.anInterface9_1);
		this.anInterface9_1.method4194(this);
	}
}
