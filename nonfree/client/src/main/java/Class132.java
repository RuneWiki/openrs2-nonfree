import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class132 {

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "Lclient!mp;")
	public Class25_Sub5 aClass25_Sub5_1;

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "Z")
	public boolean aBoolean293;

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "Lclient!im;")
	public Class108 aClass108_2;

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "Lclient!mp;")
	public Class25_Sub5 aClass25_Sub5_2;

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "B")
	public byte aByte45;

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "B")
	public byte aByte46;

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "Lclient!go;")
	public Class25_Sub3 aClass25_Sub3_1;

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "S")
	public short aShort58;

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "Lclient!jc;")
	public Class116 aClass116_3;

	@OriginalMember(owner = "client!ke", name = "s", descriptor = "Lclient!t;")
	public Class25_Sub2 aClass25_Sub2_1;

	@OriginalMember(owner = "client!ke", name = "t", descriptor = "B")
	public byte aByte48;

	@OriginalMember(owner = "client!ke", name = "v", descriptor = "Lclient!go;")
	public Class25_Sub3 aClass25_Sub3_2;

	@OriginalMember(owner = "client!ke", name = "w", descriptor = "B")
	public byte aByte49;

	@OriginalMember(owner = "client!ke", name = "x", descriptor = "Z")
	public boolean aBoolean294;

	@OriginalMember(owner = "client!ke", name = "y", descriptor = "Z")
	public boolean aBoolean295;

	@OriginalMember(owner = "client!ke", name = "z", descriptor = "Lclient!ke;")
	public Class132 aClass132_1;

	@OriginalMember(owner = "client!ke", name = "A", descriptor = "Lclient!pq;")
	public Class25_Sub4 aClass25_Sub4_2;

	@OriginalMember(owner = "client!ke", name = "C", descriptor = "B")
	public byte aByte51 = 0;

	@OriginalMember(owner = "client!ke", name = "q", descriptor = "S")
	public final short aShort59;

	@OriginalMember(owner = "client!ke", name = "u", descriptor = "S")
	public final short aShort60;

	@OriginalMember(owner = "client!ke", name = "B", descriptor = "B")
	public byte aByte50;

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "B")
	public byte aByte47;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(III)V")
	public Class132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort59 = (short) arg1;
		this.aShort60 = (short) arg2;
		this.aByte47 = this.aByte50 = (byte) arg0;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	public void method2682() {
		while (this.aClass116_3 != null) {
			@Pc(13) Class116 local13 = this.aClass116_3.aClass116_2;
			this.aClass116_3.method2471();
			this.aClass116_3 = local13;
		}
		this.aByte51 = 0;
	}
}
