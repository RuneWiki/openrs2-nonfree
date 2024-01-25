import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "Z")
	private boolean aBoolean10;

	@OriginalMember(owner = "client!aj", name = "p", descriptor = "Z")
	private boolean aBoolean12;

	@OriginalMember(owner = "client!aj", name = "w", descriptor = "Lclient!ed;")
	private Class84 aClass84_3;

	@OriginalMember(owner = "client!aj", name = "x", descriptor = "Lclient!ed;")
	private Class84 aClass84_4;

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "Lclient!ed;")
	private Class84 aClass84_1;

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "Lclient!ed;")
	private Class84 aClass84_2;

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "Lclient!wh;")
	private Class50_Sub1 aClass50_Sub1_1;

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "Z")
	private final boolean aBoolean11;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lclient!er;)V")
	public Class15_Sub2(@OriginalArg(0) Class31_Sub2 arg0) {
		super(arg0);
		if (super.aClass31_Sub2_40.aBoolean225) {
			this.aClass84_3 = Static503.method6752(super.aClass31_Sub2_40, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass84_4 = Static503.method6752(super.aClass31_Sub2_40, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass84_1 = Static503.method6752(super.aClass31_Sub2_40, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.aClass84_2 = Static503.method6752(super.aClass31_Sub2_40, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.aClass84_2 != null & this.aClass84_3 != null & this.aClass84_4 != null & this.aClass84_1 != null) {
				this.aClass50_Sub1_1 = new Class50_Sub1(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass50_Sub1_1.method1507(false, false);
				this.aBoolean11 = true;
			} else {
				this.aBoolean11 = false;
			}
		} else {
			this.aBoolean11 = false;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6942(@OriginalArg(0) boolean arg0) {
		this.aBoolean10 = arg0;
		super.aClass31_Sub2_40.method2513(1);
		super.aClass31_Sub2_40.method2535(this.aClass50_Sub1_1);
		super.aClass31_Sub2_40.method2536(7681, 34165);
		super.aClass31_Sub2_40.method2523(768, 34166, 0);
		super.aClass31_Sub2_40.method2523(770, 5890, 2);
		super.aClass31_Sub2_40.method2499(34168, 0);
		super.aClass31_Sub2_40.method2513(0);
		this.method162();
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6945(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(Z)V")
	public void method162() {
		@Pc(7) Class42_Sub1 local7 = super.aClass31_Sub2_40.bf;
		if (this.aBoolean10) {
			OpenGL.glBindProgramARB(34336, super.aClass31_Sub2_40.anInt3155 == Integer.MAX_VALUE ? this.aClass84_4.anInt2708 : this.aClass84_2.anInt2708);
		} else {
			OpenGL.glBindProgramARB(34336, ~super.aClass31_Sub2_40.anInt3155 == Integer.MIN_VALUE ? this.aClass84_3.anInt2708 : this.aClass84_1.anInt2708);
		}
		local7.method1229(-1.0F, 0.0F, (float) super.aClass31_Sub2_40.anInt3155, Static131.aFloatArray27, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static131.aFloatArray27[0], Static131.aFloatArray27[1], Static131.aFloatArray27[2], Static131.aFloatArray27[3]);
		OpenGL.glEnable(34336);
		this.aBoolean12 = true;
		this.method164();
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILclient!ep;I)V")
	@Override
	public void method6947(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		if (arg0 == null) {
			super.aClass31_Sub2_40.method2535(super.aClass31_Sub2_40.aClass50_Sub1_2);
			super.aClass31_Sub2_40.method2495(1);
			super.aClass31_Sub2_40.method2523(768, 34168, 0);
			super.aClass31_Sub2_40.method2499(34168, 0);
		} else {
			super.aClass31_Sub2_40.method2535(arg0);
			super.aClass31_Sub2_40.method2495(arg1);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)V")
	@Override
	public void method6948(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6946() {
		return this.aBoolean11;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
	@Override
	public void method6944() {
		if (this.aBoolean12) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean12 = false;
		}
		super.aClass31_Sub2_40.method2513(1);
		super.aClass31_Sub2_40.method2535(null);
		super.aClass31_Sub2_40.method2536(8448, 8448);
		super.aClass31_Sub2_40.method2523(768, 5890, 0);
		super.aClass31_Sub2_40.method2523(770, 34166, 2);
		super.aClass31_Sub2_40.method2499(5890, 0);
		super.aClass31_Sub2_40.method2513(0);
		super.aClass31_Sub2_40.method2523(768, 5890, 0);
		super.aClass31_Sub2_40.method2499(5890, 0);
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)V")
	public void method164() {
		if (!this.aBoolean12) {
			return;
		}
		@Pc(6) int local6 = super.aClass31_Sub2_40.U();
		@Pc(10) int local10 = super.aClass31_Sub2_40.BA();
		@Pc(21) float local21 = -((float) (local6 - local10) * 0.125F) + (float) local6;
		@Pc(32) float local32 = -((float) (local6 - local10) * 0.25F) + (float) local6;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local32, local21, 1.0F / (float) super.aClass31_Sub2_40.anInt3175, (float) super.aClass31_Sub2_40.anInt3171 / 255.0F);
		super.aClass31_Sub2_40.method2513(1);
		super.aClass31_Sub2_40.method2572(super.aClass31_Sub2_40.anInt3166);
		super.aClass31_Sub2_40.method2513(0);
	}
}
