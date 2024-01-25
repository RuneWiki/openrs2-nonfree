import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class6_Sub7_Sub3 extends Class6_Sub7 {

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "B")
	private byte aByte109;

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
	private int anInt7195;

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "Ljava/lang/String;")
	private String aString94 = null;

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "J")
	private long aLong207 = -1L;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ag;I)V")
	@Override
	public void method6990(@OriginalArg(0) Class6_Sub2 arg0) {
		@Pc(12) Class157 local12 = new Class157();
		local12.anInt4293 = this.anInt7195;
		local12.aString50 = this.aString94;
		local12.aByte77 = this.aByte109;
		arg0.method414(local12);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!gga;B)V")
	@Override
	public void method6993(@OriginalArg(0) Class6_Sub23 arg0) {
		if (arg0.method8374() != 255) {
			arg0.anInt9901--;
			this.aLong207 = arg0.method8381();
		}
		this.aString94 = arg0.method8359();
		this.anInt7195 = arg0.method8363();
		this.aByte109 = arg0.method8391();
		arg0.method8381();
		if (Static225.aBoolean226) {
			System.out.println("memberhash:" + this.aLong207 + " membername:" + this.aString94);
		}
	}
}
