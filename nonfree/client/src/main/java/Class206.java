import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class206 {

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "Lclient!nj;")
	public Class206 aClass206_1;

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "B")
	public byte aByte68;

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "Z")
	public boolean aBoolean415;

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "Lclient!kr;")
	public Class168 aClass168_2;

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "Lclient!rd;")
	public Class249 aClass249_2;

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "B")
	public byte aByte69;

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "Z")
	public boolean aBoolean416;

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "Z")
	public boolean aBoolean417;

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "Lclient!hu;")
	public Class47_Sub4 aClass47_Sub4_1;

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "B")
	public byte aByte72;

	@OriginalMember(owner = "client!nj", name = "p", descriptor = "Lclient!uj;")
	public Class47_Sub5 aClass47_Sub5_1;

	@OriginalMember(owner = "client!nj", name = "s", descriptor = "Lclient!lca;")
	public Class47_Sub1 aClass47_Sub1_1;

	@OriginalMember(owner = "client!nj", name = "u", descriptor = "Lclient!sm;")
	public Class47_Sub3 aClass47_Sub3_1;

	@OriginalMember(owner = "client!nj", name = "w", descriptor = "Lclient!hu;")
	public Class47_Sub4 aClass47_Sub4_2;

	@OriginalMember(owner = "client!nj", name = "y", descriptor = "S")
	public short aShort96;

	@OriginalMember(owner = "client!nj", name = "z", descriptor = "Lclient!uj;")
	public Class47_Sub5 aClass47_Sub5_2;

	@OriginalMember(owner = "client!nj", name = "D", descriptor = "B")
	public byte aByte74;

	@OriginalMember(owner = "client!nj", name = "n", descriptor = "B")
	public byte aByte71 = 0;

	@OriginalMember(owner = "client!nj", name = "q", descriptor = "S")
	public final short aShort95;

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "S")
	public final short aShort94;

	@OriginalMember(owner = "client!nj", name = "r", descriptor = "B")
	public byte aByte73;

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "B")
	public byte aByte70;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(III)V")
	public Class206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort95 = (short) arg1;
		this.aShort94 = (short) arg2;
		this.aByte70 = this.aByte73 = (byte) arg0;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
	public void method5292() {
		while (this.aClass168_2 != null) {
			@Pc(10) Class168 local10 = this.aClass168_2.aClass168_1;
			this.aClass168_2.method4330();
			this.aClass168_2 = local10;
		}
		this.aByte71 = 0;
	}
}
