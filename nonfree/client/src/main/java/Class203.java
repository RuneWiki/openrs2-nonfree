import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public final class Class203 {

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "S")
	public final short aShort87;

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "Lclient!q;")
	public Interface8 anInterface8_6;

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "B")
	public byte aByte74;

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "Lclient!mm;")
	private final Class55_Sub1 aClass55_Sub1_41;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "B")
	public final byte aByte73;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!mm;Lclient!q;III)V")
	public Class203(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) Interface8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aShort87 = (short) arg2;
		this.anInterface8_6 = arg1;
		this.aByte74 = (byte) arg4;
		this.aClass55_Sub1_41 = arg0;
		this.aByte73 = (byte) arg3;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
	public void method5859() {
		this.aClass55_Sub1_41.method3699(this.anInterface8_6);
		this.anInterface8_6.method1360(this);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V")
	public void method5860() {
		this.aClass55_Sub1_41.method3699(this.anInterface8_6);
		this.anInterface8_6.method1361(this);
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)V")
	public void method5861() {
		this.aClass55_Sub1_41.method3699(this.anInterface8_6);
		this.anInterface8_6.method1364(this);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
	public void method5862() {
		this.aClass55_Sub1_41.method3699(this.anInterface8_6);
		this.anInterface8_6.method1362(this);
	}
}
