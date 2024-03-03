import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public final class Class126 {

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "Lclient!bf;")
	private final Class19_Sub1 aClass19_Sub1_18;

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "S")
	public final short aShort39;

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "B")
	public byte aByte28;

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "B")
	public final byte aByte29;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "Lclient!fg;")
	public Interface5 anInterface5_3;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lclient!bf;Lclient!fg;III)V", line = 52)
	public Class126(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass19_Sub1_18 = arg0;
		this.aShort39 = (short) arg2;
		this.aByte28 = (byte) arg4;
		this.aByte29 = (byte) arg3;
		this.anInterface5_3 = arg1;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V", line = 4)
	public void method3383() {
		this.aClass19_Sub1_18.method783(this.anInterface5_3);
		this.anInterface5_3.method4604(this);
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V", line = 15)
	public void method3384() {
		this.aClass19_Sub1_18.method783(this.anInterface5_3);
		this.anInterface5_3.method4599(this);
	}

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V", line = 27)
	public void method3385() {
		this.aClass19_Sub1_18.method783(this.anInterface5_3);
		this.anInterface5_3.method4601(this);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V", line = 40)
	public void method3386() {
		this.aClass19_Sub1_18.method783(this.anInterface5_3);
		this.anInterface5_3.method4602(this);
	}
}
