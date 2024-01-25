import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class45 {

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "Lclient!ai;")
	public Class9 aClass9_1;

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "Lclient!dh;")
	public Class45 aClass45_1;

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "Z")
	public boolean aBoolean63;

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "Lclient!lq;")
	public Class5_Sub1 aClass5_Sub1_1;

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "Lclient!pl;")
	public Class160 aClass160_1;

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "Lclient!ua;")
	public Class5_Sub5 aClass5_Sub5_1;

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "Z")
	public boolean aBoolean64;

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "B")
	public byte aByte6;

	@OriginalMember(owner = "client!dh", name = "t", descriptor = "Lclient!lq;")
	public Class5_Sub1 aClass5_Sub1_2;

	@OriginalMember(owner = "client!dh", name = "u", descriptor = "B")
	public byte aByte9;

	@OriginalMember(owner = "client!dh", name = "v", descriptor = "Lclient!dm;")
	public Class5_Sub2 aClass5_Sub2_1;

	@OriginalMember(owner = "client!dh", name = "w", descriptor = "Lclient!on;")
	public Class5_Sub3 aClass5_Sub3_1;

	@OriginalMember(owner = "client!dh", name = "z", descriptor = "Z")
	public boolean aBoolean65;

	@OriginalMember(owner = "client!dh", name = "B", descriptor = "B")
	public byte aByte10;

	@OriginalMember(owner = "client!dh", name = "C", descriptor = "B")
	public byte aByte11;

	@OriginalMember(owner = "client!dh", name = "D", descriptor = "S")
	public short aShort9;

	@OriginalMember(owner = "client!dh", name = "E", descriptor = "Lclient!ua;")
	public Class5_Sub5 aClass5_Sub5_2;

	@OriginalMember(owner = "client!dh", name = "s", descriptor = "B")
	public byte aByte8 = 0;

	@OriginalMember(owner = "client!dh", name = "y", descriptor = "S")
	public final short aShort7;

	@OriginalMember(owner = "client!dh", name = "A", descriptor = "S")
	public final short aShort8;

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "B")
	public byte aByte5;

	@OriginalMember(owner = "client!dh", name = "q", descriptor = "B")
	public byte aByte7;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(III)V")
	public Class45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort7 = (short) arg2;
		this.aShort8 = (short) arg1;
		this.aByte7 = this.aByte5 = (byte) arg0;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
	public void method1006() {
		while (this.aClass160_1 != null) {
			@Pc(7) Class160 local7 = this.aClass160_1.aClass160_3;
			this.aClass160_1.method4146();
			this.aClass160_1 = local7;
		}
		this.aByte8 = 0;
	}
}
