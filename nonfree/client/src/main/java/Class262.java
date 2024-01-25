import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class262 {

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "Lclient!oaa;")
	public Class208 aClass208_2;

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "Z")
	public boolean aBoolean590;

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "Lclient!iq;")
	public Class1_Sub5 aClass1_Sub5_1;

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "Z")
	public boolean aBoolean591;

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "Lclient!waa;")
	public Class1_Sub4 aClass1_Sub4_1;

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "B")
	public byte aByte93;

	@OriginalMember(owner = "client!sk", name = "j", descriptor = "Lclient!laa;")
	public Class1_Sub2 aClass1_Sub2_2;

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "Lclient!sk;")
	public Class262 aClass262_1;

	@OriginalMember(owner = "client!sk", name = "m", descriptor = "Lclient!mg;")
	public Class187 aClass187_3;

	@OriginalMember(owner = "client!sk", name = "n", descriptor = "B")
	public byte aByte94;

	@OriginalMember(owner = "client!sk", name = "o", descriptor = "B")
	public byte aByte95;

	@OriginalMember(owner = "client!sk", name = "q", descriptor = "Lclient!vf;")
	public Class1_Sub3 aClass1_Sub3_2;

	@OriginalMember(owner = "client!sk", name = "r", descriptor = "B")
	public byte aByte97;

	@OriginalMember(owner = "client!sk", name = "s", descriptor = "Lclient!laa;")
	public Class1_Sub2 aClass1_Sub2_3;

	@OriginalMember(owner = "client!sk", name = "u", descriptor = "Lclient!vf;")
	public Class1_Sub3 aClass1_Sub3_3;

	@OriginalMember(owner = "client!sk", name = "w", descriptor = "Z")
	public boolean aBoolean592;

	@OriginalMember(owner = "client!sk", name = "y", descriptor = "S")
	public short aShort132;

	@OriginalMember(owner = "client!sk", name = "x", descriptor = "B")
	public byte aByte99 = 0;

	@OriginalMember(owner = "client!sk", name = "v", descriptor = "B")
	public byte aByte98;

	@OriginalMember(owner = "client!sk", name = "p", descriptor = "B")
	public byte aByte96;

	@OriginalMember(owner = "client!sk", name = "t", descriptor = "S")
	public final short aShort131;

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "S")
	public final short aShort130;

	static {
		new Class202("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
	}

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(III)V")
	public Class262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte96 = this.aByte98 = (byte) arg0;
		this.aShort131 = (short) arg2;
		this.aShort130 = (short) arg1;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
	public void method6718() {
		while (this.aClass187_3 != null) {
			@Pc(7) Class187 local7 = this.aClass187_3.aClass187_1;
			this.aClass187_3.method4694();
			this.aClass187_3 = local7;
		}
		this.aByte99 = 0;
	}
}
